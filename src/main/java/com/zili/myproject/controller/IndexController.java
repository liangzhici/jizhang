package com.zili.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap map){
        map.put("name", "yizhici");
        return "index";
    }
}
