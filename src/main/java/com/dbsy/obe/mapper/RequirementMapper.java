package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Requirement;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequirementMapper {
    int insert(Requirement record);

    int insertSelective(Requirement record);
}