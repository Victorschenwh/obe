package com.dbsy.obe.controller;

import com.dbsy.obe.service.DepartmentService;
import com.dbsy.obe.util.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/department")

public class DepartmentController {

    @Autowired
    @Qualifier("departmentServiceImp")
    DepartmentService departmentService;

    @RequestMapping("/getAll")
    //@Authority({Role.Teacher})
    @ResponseBody
    public Map getAll() {
        return News.success("学院数据请求成功", departmentService.getAll());
    }

}
