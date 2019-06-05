package com.qf.springboot_my.controller;

import com.qf.springboot_my.entity.DataValid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("my")
@Slf4j
public class MyController {
    @RequestMapping("getString")
    @ResponseBody
    public String getString(){
        return "hello";
    }

    @Value("${p}")
    private String p;
    @RequestMapping("getMy")
    @ResponseBody
    public String getMy(){
        return p+"cccc";
    }

    @RequestMapping("getDate")
    @ResponseBody
    public Date getDate(Date date){
        return date;
    }

//    private Logger logger = LoggerFactory.getLogger(MyController.class);
    @RequestMapping("getLog")
    @ResponseBody
    public String getLog(){
        log.info("输出logger");
        return "logger";
    }
    @RequestMapping("getData")
    @ResponseBody
    public DataValid getData(@Valid DataValid data){
        return data;
    }
}
