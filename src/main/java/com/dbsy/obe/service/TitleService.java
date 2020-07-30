package com.dbsy.obe.service;

import com.dbsy.obe.pojo.Title;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TitleService {
    int insert(Title record);

    int insertSelective(Title record);

    List<Title> getAll();
}
