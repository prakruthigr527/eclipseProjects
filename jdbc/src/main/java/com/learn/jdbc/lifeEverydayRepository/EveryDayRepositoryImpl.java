package com.learn.jdbc.lifeEverydayRepository;

import com.learn.jdbc.lifeEverydayModel.EveryDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EveryDayRepositoryImpl implements EveryDayRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    public EveryDay findById(int id) {
        return jdbcTemplate.queryForObject( SELECT_ALL_QUERY + " where date=?", new Object[] {id},
                new BeanPropertyRowMapper< EveryDay >(EveryDay.class));
    }

    public List<EveryDay> findAll_2(){
        return jdbcTemplate.query( SELECT_ALL_QUERY , new Object[] {},
                new BeanPropertyRowMapper< EveryDay >(EveryDay.class));
    }

    class EverydayRowMapper implements RowMapper< EveryDay > {
        @Override
        public EveryDay mapRow(ResultSet rs, int rowNum) throws SQLException {
            EveryDay everyDay = new EveryDay();
            everyDay.setId(rs.getInt("id"));
            everyDay.setToday(Date.valueOf(rs.getString("date")).toLocalDate());
            everyDay.setActivity(rs.getString("activity"));
            everyDay.setDuration(rs.getInt("duration"));
            return everyDay;
        }
    }
    public List< EveryDay > findAll() {
        return jdbcTemplate.query(SELECT_ALL_QUERY, new EverydayRowMapper());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from everyday where id=?", new Object[] {
                id
        });
    }

    public int create(EveryDay everyday) {
        return jdbcTemplate.update("insert into everyday (date, activity, duration) " + "values(?, ?, ?)",
                new Object[] {
                         everyday.getToday(), everyday.getActivity(), everyday.getDuration()
                });
    }
}
