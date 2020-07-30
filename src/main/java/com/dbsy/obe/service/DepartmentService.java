package com.dbsy.obe.service;

import com.dbsy.obe.pojo.Department;

import java.util.List;

public interface DepartmentService {
    int insert(Department record);

    int insertSelective(Department record);

    Department get(int id);

    List<Department> getAll();
}
