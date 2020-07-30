package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.CoursePoint;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoursePointMapper {
    int insert(CoursePoint record);

    int insertSelective(CoursePoint record);
}