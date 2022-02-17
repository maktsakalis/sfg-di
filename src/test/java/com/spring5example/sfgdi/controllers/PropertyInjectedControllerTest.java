package com.spring5example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring5example.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new GreetingServiceImpl();
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}