package com.spring5example.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.spring5example.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}