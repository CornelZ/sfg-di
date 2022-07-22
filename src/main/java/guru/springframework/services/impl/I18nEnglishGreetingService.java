package guru.springframework.services.impl;

import guru.springframework.services.interfaces.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {

    return "I18nEnglishGreetingService sayGreeting";
  }
}
