package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.TeacherMapper;
import com.dbsy.obe.pojo.Teacher;
import com.dbsy.obe.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("teacherServiceImp")
public class TeacherServiceImp implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Override
    @Transactional
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(Teacher record) {
        return teacherMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return teacherMapper.listCount(map);
    }

    @Override
    public List<Teacher> list(Map map) {
        return teacherMapper.list(map);
    }

    @Override
    public Teacher get(int id) {
        return teacherMapper.get(id);
    }

    @Override
    @Transactional
    public int delete(int id) {
        return teacherMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    @Override
    @Transactional
    public int batchRemove(int[] ids) {
        return teacherMapper.batchRemove(ids);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherMapper.getAll();
    }
}
