package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.PlanMapper;
import com.dbsy.obe.pojo.Major;
import com.dbsy.obe.pojo.Plan;
import com.dbsy.obe.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("planServiceImp")
public class PlanServiceImp implements PlanService {
    @Autowired
    PlanMapper planMapper;


    @Override
    public int insert(Plan record) {
        return planMapper.insert(record);
    }

    @Override
    public int insertSelective(Plan record) {
        return planMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return planMapper.listCount(map);
    }

    @Override
    public List<Plan> list(Map map) {
        return planMapper.list(map);
    }

    @Override
    public Plan get(int id) {
        return planMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return planMapper.delete(id);
    }

    @Override
    public int update(Plan plan) {
        return planMapper.update(plan);
    }

    @Override
    public int batchRemove(int[] ids) {
        return planMapper.batchRemove(ids);
    }

    @Override
    public List<Plan> getAll() {
        return planMapper.getAll();
    }
}
