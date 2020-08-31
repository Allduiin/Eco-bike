package test.task.ecobike;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import test.task.ecobike.service.MainService;
import test.task.ecobike.service.ReadFromFileService;

@SpringBootApplication
public class EcoBikeApplication {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(EcoBikeApplication.class, args);
        run.getBean(ReadFromFileService.class)
                .read("D:\\Java\\ecobike\\src\\main\\resources\\TestFile.txt");
        run.getBean(MainService.class).showCatalog();
    }
}
