package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Major;

public interface MajorMapper {
    int insert(Major record);

    int insertSelective(Major record);
}