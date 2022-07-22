package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingSerrviceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "ConstructorGreetingSerrviceImpl:sayGreeting()";
  }
}
