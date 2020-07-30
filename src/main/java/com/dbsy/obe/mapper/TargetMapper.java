package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Target;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TargetMapper {
    int insert(Target record);

    int insertSelective(Target record);
}