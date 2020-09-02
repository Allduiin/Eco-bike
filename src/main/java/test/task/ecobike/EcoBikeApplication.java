package test.task.ecobike;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import test.task.ecobike.service.ReadFromFileService;
import test.task.ecobike.service.console.AddNewBikeService;
import test.task.ecobike.service.console.SearchService;
import test.task.ecobike.service.console.ShowCatalogService;

@SpringBootApplication
public class EcoBikeApplication {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(EcoBikeApplication.class, args);
        run.getBean(ReadFromFileService.class)
                .read("D:\\Java\\ecobike\\src\\main\\resources\\TestFile.txt");

        ShowCatalogService showCatalogService = run.getBean(ShowCatalogService.class);
        showCatalogService.showCatalog();

        SearchService searchService = run.getBean(SearchService.class);
        searchService.Search();

    }
}
