package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.DepartmentMapper;
import com.dbsy.obe.pojo.Department;
import com.dbsy.obe.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentServiceImp")
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }

    @Override
    public Department get(int id) {
        return departmentMapper.get(id);
    }

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }
}
