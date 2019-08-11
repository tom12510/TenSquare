package com.tom.base.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @CLASSNAME BaseExceptionHandler
 * @Description
 * @Author miaomiaole
 * @Date 2019/08/08/18:20
 * Version 1.0
 **/
//拦截器执行  执行过程报错中拦截
@ControllerAdvice//控制层通知
public class BaseExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e) {

        return new Result(false, StatusCode.ERROR, e.getMessage());
    }

}
