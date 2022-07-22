package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingRepository;
import guru.springframework.services.interfaces.GreetingService;

public class PrimarySpanishGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return greetingRepository.getSpanishGreeting();
  }
}
