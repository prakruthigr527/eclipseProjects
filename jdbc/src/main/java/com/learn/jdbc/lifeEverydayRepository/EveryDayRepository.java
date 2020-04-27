package com.learn.jdbc.lifeEverydayRepository;

import com.learn.jdbc.lifeEverydayModel.EveryDay;

import java.util.List;

public interface EveryDayRepository {
    String SELECT_ALL_QUERY = "Select * from EveryDay";

    public EveryDay findById(int id);

    public List< EveryDay > findAll();

    public int deleteById(int id);

    public int create(EveryDay everyday);

}
