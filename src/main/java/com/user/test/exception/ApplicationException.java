package com.user.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ApplicationException extends RuntimeException{


  public ApplicationException(){

  }
  public ApplicationException(String msg){
      super(msg);
  }
  public ApplicationException(String msg,Throwable t){
      super(msg,t);
  }


}
