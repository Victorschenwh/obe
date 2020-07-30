package com.dbsy.obe.controller;

import com.dbsy.obe.service.TitleService;
import com.dbsy.obe.util.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/title")
public class TitleController {
    @Autowired
    @Qualifier("titleServiceImp")
    TitleService titleService;

    @RequestMapping("/getAll")
    @ResponseBody
    public Map getAll() {
        return News.success("职称信息获取成功", titleService.getAll());
    }

}
