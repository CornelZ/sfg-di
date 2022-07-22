package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingRepository;
import guru.springframework.services.interfaces.GreetingService;

public class PrimaryGermanGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return greetingRepository.getGermanGreeting();
  }
}
