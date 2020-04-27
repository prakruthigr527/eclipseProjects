package com.learn.jdbc.lifeEveryDayService;

import com.learn.jdbc.lifeEverydayModel.EveryDay;
import com.learn.jdbc.lifeEverydayRepository.EveryDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EveryDayServiceImpl implements EveryDayService {

    private final EveryDayRepository everyDayRepository;

    @Autowired
    public EveryDayServiceImpl(EveryDayRepository everyDayRepository) {
        this.everyDayRepository = everyDayRepository;
    }

    public void createEveryDayActivity(EveryDay everyDay){
        everyDayRepository.create(everyDay);
    }
    public EveryDay getEveryDayActivity(int id){
        return everyDayRepository.findById(id);
    }

    public List<EveryDay> getAllEveryDayActivities(){
        return everyDayRepository.findAll();
    }

    public void deleteEveryDayActivity(int id){
        everyDayRepository.deleteById(id);
    }
}

