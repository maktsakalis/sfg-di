package com.spring5example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring5example.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  @Qualifier("setterGreetingService")
  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
