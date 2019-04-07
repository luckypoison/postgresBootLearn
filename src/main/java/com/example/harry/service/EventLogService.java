package com.example.harry.service;

import com.example.harry.entity.EventLog;

import java.util.List;
import java.util.Map;

public interface EventLogService {

    public void insert(EventLog eventLog);

    public List<Map<String,Object>> deleteOverdueRecord(Integer overdueDays);

}
