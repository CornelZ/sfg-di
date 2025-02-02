package guru.springframework.sfgdi.controllers;

import guru.springframework.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
  private GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }

  @Qualifier("setterInjectedGreetingServiceImpl")
  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }
}
