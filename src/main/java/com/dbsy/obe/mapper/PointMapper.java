package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Point;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointMapper {
    int insert(Point record);

    int insertSelective(Point record);
}