package com.dbsy.obe.mapper;

import com.dbsy.obe.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    int insert(Department record);

    int insertSelective(Department record);

    @Select("select * from department where id = #{id}")
    Department get(int id);

    @Select("select * from department")
    List<Department> getAll();
}