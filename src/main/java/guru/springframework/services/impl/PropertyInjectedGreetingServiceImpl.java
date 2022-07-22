package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "PropertyInjectedGreetingServiceImpl:sayGreeting()";
  }
}
