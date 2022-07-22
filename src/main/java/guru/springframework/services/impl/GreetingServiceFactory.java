package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingRepository;
import guru.springframework.services.interfaces.GreetingService;

public class GreetingServiceFactory {
  private GreetingRepository greetingRepository;

  public GreetingServiceFactory(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService createGreetingService(String lang) {

    switch (lang) {
      case "en":
        return new PrimaryGreetingService(greetingRepository);
      case "de":
        return new PrimaryGermanGreetingService(greetingRepository);
      case "es":
        return new PrimarySpanishGreetingService(greetingRepository);
      default:
        return new PrimaryGreetingService(greetingRepository);
    }
  }
}
