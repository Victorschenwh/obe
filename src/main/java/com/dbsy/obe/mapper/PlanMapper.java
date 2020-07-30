package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Plan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlanMapper {
    int insert(Plan record);

    int insertSelective(Plan record);
}