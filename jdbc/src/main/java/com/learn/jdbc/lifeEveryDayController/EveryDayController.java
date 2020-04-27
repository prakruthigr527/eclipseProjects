package com.learn.jdbc.lifeEveryDayController;

import com.learn.jdbc.lifeEveryDayService.EveryDayService;
import com.learn.jdbc.lifeEverydayModel.EveryDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EveryDayController {
    private final EveryDayService everyDayService;

    @Autowired
    public EveryDayController(EveryDayService everyDayService) {
        this.everyDayService = everyDayService;
    }

    @RequestMapping(value = "/activities", method = RequestMethod.POST)
    public ResponseEntity<Object> postEveryDayActivity(@RequestBody EveryDay everyDay){
        everyDayService.createEveryDayActivity(everyDay);
        return new ResponseEntity<>("EveryDay Activity is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/activities")
    public ResponseEntity<Object> getAllEveryDayActivities(){
         return new ResponseEntity<>(everyDayService.getAllEveryDayActivities(), HttpStatus.OK);
    }

    @RequestMapping(value = "/activities/{id}")
    public ResponseEntity<Object> getEveryDayActivity(@PathVariable("id") int id){
        return new ResponseEntity<>(everyDayService.getEveryDayActivity(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/activities/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteEveryDayActivity (@PathVariable("id") int id) {
        everyDayService.deleteEveryDayActivity(id);
        return new ResponseEntity<>("EveryDay Activity is deleted successsfully", HttpStatus.OK);
    }
}
