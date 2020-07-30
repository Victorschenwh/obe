package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.TitleMapper;
import com.dbsy.obe.pojo.Title;
import com.dbsy.obe.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("titleServiceImp")
public class TitleServiceImp implements TitleService {
    @Autowired
    TitleMapper titleMapper;

    @Override
    @Transactional
    public int insert(Title record) {
        return titleMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Title record) {
        return titleMapper.insertSelective(record);
    }

    @Override
    public List<Title> getAll() {
        return titleMapper.getAll();
    }
}
