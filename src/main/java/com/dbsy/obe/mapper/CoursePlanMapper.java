package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.CoursePlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoursePlanMapper {
    int insert(CoursePlan record);

    int insertSelective(CoursePlan record);
}