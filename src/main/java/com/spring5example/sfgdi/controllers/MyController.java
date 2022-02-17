package com.spring5example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring5example.sfgdi.services.GreetingService;

@Controller
public class MyController {

  @Autowired
  GreetingService greetingService;

  public String sayHelloWorld() {
    return greetingService.sayGreeting();
  }
}
