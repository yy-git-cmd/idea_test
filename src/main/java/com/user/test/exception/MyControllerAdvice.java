package com.user.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice  {
    @ResponseBody
    @ExceptionHandler(value = java.lang.Exception.class)
    public Map<String,Object> MyException(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code",500);
        map.put("msg","出错了");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = java.lang.NullPointerException.class)
    public Map<String,Object> MyException1(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code",-500);
        map.put("msg","空指针异常");
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = com.user.test.exception.ApplicationException.class)
    public Map<String,Object> MyException2(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code",-500);
        map.put("msg",e.getMessage());
        return map;
    }


}
