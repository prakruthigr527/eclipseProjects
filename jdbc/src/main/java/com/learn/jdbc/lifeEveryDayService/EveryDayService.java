package com.learn.jdbc.lifeEveryDayService;

import com.learn.jdbc.lifeEverydayModel.EveryDay;

import java.util.List;

public interface EveryDayService {

    public void createEveryDayActivity(EveryDay everyDay);

    public EveryDay getEveryDayActivity(int id);

    public List<EveryDay>  getAllEveryDayActivities();

    public void deleteEveryDayActivity(int id);
}
