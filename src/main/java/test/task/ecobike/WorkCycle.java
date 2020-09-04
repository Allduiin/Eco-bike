package test.task.ecobike;

import java.io.IOException;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import test.task.ecobike.service.ReadFromFileService;
import test.task.ecobike.service.console.AddNewBikeService;
import test.task.ecobike.service.console.SearchService;
import test.task.ecobike.service.console.ShowCatalogService;
import test.task.ecobike.service.console.WriteToFileService;

@Component
@AllArgsConstructor
public class WorkCycle {
    private static final String COMMANDS = "/show_catalog - show you catalog of our bikes\n"
            + "/add_new_bike - by this command you can add new bike to catalog\n"
            + "/search - takes possibility to find bikes that you want by params\n"
            + "/write_to_file - you can write to new or existed file our catalog\n"
            + "/stop - stops program\n"
            + "/help - if you want to see commands";
    private static final String FILE_PATH = "D:\\Java\\ecobike\\src\\main\\resources\\ecobike.txt";
    private final AddNewBikeService addNewBikeService;
    private final ShowCatalogService showCatalogService;
    private final SearchService searchService;
    private final WriteToFileService writeToFileService;
    private final ReadFromFileService readFromFileService;

    public void work() {
        initializeDataBase();
        System.out.println("Welcome to e-bike, commands that you can use:");
        System.out.println(COMMANDS);
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                switch (in.nextLine()) {
                    case ("/show_catalog"):
                        showCatalogService.showCatalog();
                        break;
                    case ("/add_new_bike"):
                        addNewBikeService.addNewBike(in);
                        break;
                    case ("/search"):
                        searchService.search(in);
                        break;
                    case ("/write_to_file"):
                        writeToFileService.writeToFile();
                        break;
                    case ("/stop"):
                        System.out.println("Good luck and good mood");
                        return;
                    case ("/help"):
                        System.out.println(COMMANDS);
                        break;
                    default:
                        System.out.println();
                }
            }
        }
    }

    private void initializeDataBase() {
        try {
            readFromFileService.read(FILE_PATH);
        } catch (IOException e) {
            throw new RuntimeException("Can not read from this file", e);
        }
    }
}
