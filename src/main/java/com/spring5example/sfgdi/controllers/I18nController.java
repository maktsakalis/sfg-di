package com.spring5example.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.spring5example.sfgdi.services.GreetingService;

@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

}
