package com.codingTool.controller;

import com.codingTool.entity.HomeCommon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/common")
public class HomePageController extends BaseController {

    @GetMapping("test")
    public String Home(){
        return "Welcome to Kaleidoscope！";
    }

    /**
     * 页面通用数据获取
     * @return
     */
    @GetMapping("/getCommonData")
    public HomeCommon getCommonData(){
        HomeCommon homeCommon = new HomeCommon();
        homeCommon.setDescribe("欢迎来到万花筒项目，持续更新中，敬请期待~");
        homeCommon.setUrl("www.uaike.com");
        return homeCommon;
    }

}
