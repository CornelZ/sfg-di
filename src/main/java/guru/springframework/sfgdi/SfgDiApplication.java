package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework.services", "guru.springframework.sfgdi"})
public class SfgDiApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    System.out.println("---myController");
    MyController myController = (MyController) ctx.getBean("myController");
    System.out.println(myController.sayHello());

    System.out.println("---propertyInjectedController");
    System.out.println(ctx.getBean(PropertyInjectedController.class).getGreeting());

    System.out.println("---setterInjectedController");
    System.out.println(ctx.getBean(SetterInjectedController.class).getGreeting());

    System.out.println("---constructorInjectedController");
    System.out.println(ctx.getBean(ConstructorInjectedController.class).getGreeting());

    System.out.println("---i18nController");
    I18nController i18nController = (I18nController) ctx.getBean("i18nController");
    System.out.println(i18nController.sayHello());
  }
}
