package com.example.harry.controller;

import com.example.harry.dao.EventLogMapper;
import com.example.harry.entity.EventLog;
import com.example.harry.service.EventLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EventLogController {

    @Autowired
    private EventLogService service;

    @DeleteMapping("/retention")
    public void deleteOverdueLog(){
        List<Map<String,Object>> returnList = service.deleteOverdueRecord(1);
        System.out.println(returnList);
        for(Map<String,Object> item : returnList){
            System.out.println(item.get("id"));
            System.out.println(item.get("start_time"));
            System.out.println(item.get("log_detail"));
        }
    }

    @PostMapping("/eventLog")
    public void addEventLog(@RequestBody EventLog eventLog){
        service.insert(eventLog);
    }

}
