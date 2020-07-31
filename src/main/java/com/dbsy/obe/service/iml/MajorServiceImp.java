package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.MajorMapper;
import com.dbsy.obe.pojo.Major;
import com.dbsy.obe.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service("majorServiceImp")

public class MajorServiceImp implements MajorService {

    @Autowired
    MajorMapper majorMapper;


    @Override
    @Transactional
    public int insert(Major record) {
        return majorMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Major record) {
        return majorMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return majorMapper.listCount(map);
    }

    @Override
    @Transactional
    public List<Major> list(Map map) {
        return majorMapper.list(map);
    }

    @Override
    public Major get(int id) {
        return majorMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return majorMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Major major) {
        return majorMapper.update(major);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return majorMapper.batchRemove(ids);
    }

    @Override
    public List<Major> getAll() {
        return majorMapper.getAll();
    }
}
