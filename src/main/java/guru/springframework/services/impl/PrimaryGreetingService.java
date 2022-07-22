package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingRepository;
import guru.springframework.services.interfaces.GreetingService;

public class PrimaryGreetingService implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return greetingRepository.getEnglishGreeting();
  }
}
