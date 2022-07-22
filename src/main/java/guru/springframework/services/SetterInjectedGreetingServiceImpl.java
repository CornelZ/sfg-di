package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "SetterInjectedGreetingServiceImpl:sayGreeting()";
  }
}
