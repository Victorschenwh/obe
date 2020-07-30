package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TitleMapper {
    int insert(Title record);

    int insertSelective(Title record);

    @Select("select * from title")
    List<Title> getAll();

}