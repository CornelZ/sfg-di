package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "PrimaryGreetingServiceImpl:sayGreeting()";
  }
}
