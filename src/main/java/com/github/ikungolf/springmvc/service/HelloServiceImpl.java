package com.github.ikungolf.springmvc.service;

import com.github.ikungolf.springmvc.dao.HelloWorldDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

  @Autowired
  public HelloWorldDao dao;

  @Override
  public String getMessage() {
    return dao.getMessage();
  }
}
