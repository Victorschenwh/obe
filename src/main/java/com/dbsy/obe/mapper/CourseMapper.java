package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    int insert(Course record);

    int insertSelective(Course record);
}