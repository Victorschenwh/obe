package com.dbsy.obe.service.iml;

import com.dbsy.obe.mapper.PointMapper;
import com.dbsy.obe.pojo.Point;
import com.dbsy.obe.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("pointServiceImp")
public class PointServiceImp implements PointService {
    @Autowired
    PointMapper pointMapper;


    @Override
    public int insert(Point record) {
        return pointMapper.insert(record);
    }

    @Override
    public int insertSelective(Point record) {
        return pointMapper.insertSelective(record);
    }

    @Override
    public int listCount(Map map) {
        return pointMapper.listCount(map);
    }

    @Override
    public List<Point> list(Map map) {
        return pointMapper.list(map);
    }

    @Override
    public Point get(int id) {
        return pointMapper.get(id);
    }

    @Override
    public int delete(int id) {
        return pointMapper.delete(id);
    }

    @Override
    public int update(Point point) {
        return pointMapper.update(point);
    }

    @Override
    public int batchRemove(int[] ids) {
        return pointMapper.batchRemove(ids);
    }

    @Override
    public List<Point> getAll() {
        return pointMapper.getAll();
    }
}
