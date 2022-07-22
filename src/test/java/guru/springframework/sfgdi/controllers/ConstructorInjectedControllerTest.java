package guru.springframework.sfgdi.controllers;

import guru.springframework.services.impl.ConstructorGreetingSerrviceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
  ConstructorInjectedController controller;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {
    controller = new ConstructorInjectedController(new ConstructorGreetingSerrviceImpl());
  }

  @AfterEach
  void tearDown() throws Exception {}

  @Test
  void test() {
    System.out.println(controller.getGreeting());
  }
}
