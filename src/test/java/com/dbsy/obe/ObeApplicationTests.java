package com.dbsy.obe;

import com.dbsy.obe.mapper.DepartmentMapper;
import com.dbsy.obe.myenum.Role;
import com.dbsy.obe.pojo.Department;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@MapperScan(basePackages = "com.dbsy.obe.mapper")
class ObeApplicationTests {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    DepartmentMapper departmentMapper;

    @Test
    void contextLoads() {
        log.info(Role.Teacher + "");
        //log.info("department:" + departmentMapper.select(1));
    }

}
