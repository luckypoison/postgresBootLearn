package com.example.harry.dao;

import com.example.harry.entity.EventLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface EventLogMapper {

    public Integer insertEventLog(EventLog eventLog);

    public List<Map<String,Object>> deleteOverdueLog(@Param("overdueDays") Integer overdueDays);

}
