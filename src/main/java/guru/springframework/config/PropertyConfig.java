package guru.springframework.config;

import guru.springframework.sfgdi.examplebeans.FakeDataSource;
import guru.springframework.sfgdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
// @PropertySource("classpath:datasource.properties")
// @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})

@PropertySource("classpath:datasource.properties")
@PropertySource("classpath:jms.properties")
public class PropertyConfig {

  @Autowired Environment env;

  @Value("${guru.user}")
  String user;

  @Value("${guru.password}")
  String password;

  @Value("${guru.url}")
  String url;

  @Value("${guru.jms.username}")
  String jmsUsername;

  @Value("${guru.jms.password}")
  String jmsPassoword;

  @Value("${guru.jms.url}")
  String jmsUrl;

  @Bean
  FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUser(env.getProperty("GURU_USERNAME"));
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker jmsBroker = new FakeJmsBroker();
    jmsBroker.setUsername(jmsUsername);
    jmsBroker.setPassword(jmsPassoword);
    jmsBroker.setUrl(jmsUrl);
    return jmsBroker;
  }

  @Bean
  static PropertySourcesPlaceholderConfigurer properties() {
    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
        new PropertySourcesPlaceholderConfigurer();

    return propertySourcesPlaceholderConfigurer;
  }
}
