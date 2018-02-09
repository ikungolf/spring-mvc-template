package com.github.ikungolf.springmvc.dao.impl;

import com.github.ikungolf.springmvc.dao.HelloWorldDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("helloworldDao")
@Repository("helloworldDao")
public class HelloWorldDaoImpl implements HelloWorldDao {

  private static final Logger LOGGER = Logger.getLogger(HelloWorldDaoImpl.class);

//  @Autowired
//  private JdbcTemplate jdbcTemplate;

  @Override
  public String getMessage() {
    String className = this.getClass().toString();
    return className;
  }
}
