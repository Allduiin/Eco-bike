package test.task.ecobike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcoBikeApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(EcoBikeApplication.class, args);
        run.getBean(WorkCycle.class).work();
        run.close();
    }
}
