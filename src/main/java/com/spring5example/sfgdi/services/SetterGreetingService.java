package com.spring5example.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - Setter!";
  }
}
