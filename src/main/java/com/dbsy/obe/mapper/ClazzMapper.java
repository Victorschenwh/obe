package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Clazz;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClazzMapper {
    int insert(Clazz record);

    int insertSelective(Clazz record);
}