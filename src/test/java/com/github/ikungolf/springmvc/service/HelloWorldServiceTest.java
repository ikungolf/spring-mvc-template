package com.github.ikungolf.springmvc.service;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:**/test-application-context.xml"})

@WebAppConfiguration
public class HelloWorldServiceTest {

  private static final Logger LOGGER = Logger.getLogger(HelloWorldServiceTest.class);

  @Autowired
  public HelloService service;

  @Test
  public void testCheckHelloService() throws Exception {
    Assert.assertNotNull(service);
    LOGGER.info("Message-> " + service.getMessage());
    Assert.assertEquals("class com.github.ikungolf.spring_mvc_template.dao.impl.HelloWorldDaoImpl", service.getMessage());
  }
}
