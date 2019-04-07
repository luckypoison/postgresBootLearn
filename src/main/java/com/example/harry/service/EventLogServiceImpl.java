package com.example.harry.service;

import com.example.harry.dao.EventLogMapper;
import com.example.harry.entity.EventLog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public class EventLogServiceImpl implements EventLogService {

    @Autowired
    private EventLogMapper mapper;

    @Override
    public void insert(EventLog eventLog) {

        mapper.insertEventLog(eventLog);
    }

    @Override
    public List<Map<String, Object>> deleteOverdueRecord(Integer overdueDays) {
        return mapper.deleteOverdueLog(overdueDays);
    }
}
