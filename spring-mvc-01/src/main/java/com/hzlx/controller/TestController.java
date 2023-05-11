package com.hzlx.controller;

import com.hzlx.entity.BusinessInfo;
import com.hzlx.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

  @Autowired
  private BusinessInfoService businessInfoService;

  @RequestMapping("/user/login")
    public String login(String userName,String password){
    BusinessInfo businessInfo = businessInfoService.login(userName, password);
    if (businessInfo==null){
      return  null;
    }else {
      return "system/home";
    }
  }



  @RequestMapping("/homePage")
  public String homePage(){
    return "/system/homepage";
  }

}
