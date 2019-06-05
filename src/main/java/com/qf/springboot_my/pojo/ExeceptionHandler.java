package com.qf.springboot_my.pojo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExeceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handlerExeption(Exception e){
        String message = e.getMessage();
        return new ResultBean(5566,"异常");
    }
}
