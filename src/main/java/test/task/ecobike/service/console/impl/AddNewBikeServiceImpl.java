package test.task.ecobike.service.console.impl;

import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.abstraction.Bike;
import test.task.ecobike.model.abstraction.ElectricBike;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.SpeedelecService;
import test.task.ecobike.service.console.AddNewBikeService;
import test.task.ecobike.service.console.ConsoleInputChecker;

@Service
@AllArgsConstructor
public class AddNewBikeServiceImpl implements AddNewBikeService {
    private final EBikeService ebikeService;
    private final FoldingBikeService foldingBikeService;
    private final SpeedelecService speedelecService;
    private final ConsoleInputChecker consoleInputChecker;

    @Override
    public boolean addNewBike(Scanner in) {
        System.out.println("Please write type of bike "
                + "as written here: e-bike, speedelec, folding bike");
        while (true) {
            switch (in.nextLine()) {
                case ("e-bike"):
                    addNewEBike(in);
                    return true;
                case ("speedelec"):
                    addNewSpeedelec(in);
                    return true;
                case ("folding bike"):
                    addNewFoldingBike(in);
                    return true;
                case ("/exit"):
                    return true;
                default:
                    System.out.println("not detected type of bikes, please"
                            + " try again or write \"/exit\"");
            }
        }
    }

    private boolean addNewFoldingBike(Scanner in) {
        FoldingBike bike = new FoldingBike();
        addBikeParams(bike, in);
        System.out.print("Size of the wheels: ");
        bike.setSizeOfTheWheels(consoleInputChecker.readLongFromScanner(in));
        System.out.print("Number of gears: ");
        bike.setNumberOfGears(consoleInputChecker.readLongFromScanner(in));
        foldingBikeService.add(bike);
        System.out.println("Bike was added to database");
        return true;
    }

    private boolean addNewSpeedelec(Scanner in) {
        Speedelec bike = new Speedelec();
        addBikeParams(bike, in);
        addElectricBikeParams(bike, in);
        speedelecService.add(bike);
        System.out.println("Bike was added to database");
        return true;
    }

    private boolean addNewEBike(Scanner in) {
        EBike bike = new EBike();
        addBikeParams(bike, in);
        addElectricBikeParams(bike, in);
        ebikeService.add(bike);
        System.out.println("Bike was added to database");
        return true;
    }

    private Bike addBikeParams(Bike bike, Scanner in) {
        System.out.print("Please enter all params for creation\n");
        System.out.print("Brand: ");
        bike.setBrand(in.next());
        System.out.print("Price: ");
        bike.setPrice(consoleInputChecker.readLongFromScanner(in));
        System.out.print("Color: ");
        bike.setColor(in.next());
        System.out.print("availabilityOfLights: ");
        bike.setAvailabilityOfLights(consoleInputChecker.readBooleanFromScanner(in));
        System.out.print("weight: ");
        bike.setWeight(consoleInputChecker.readLongFromScanner(in));
        return bike;
    }

    private ElectricBike addElectricBikeParams(ElectricBike electricBike, Scanner in) {
        System.out.print("Battery capacity: ");
        electricBike.setBatteryCapacity(consoleInputChecker.readLongFromScanner(in));
        System.out.print("Max speed: ");
        electricBike.setMaxSpeed(consoleInputChecker.readLongFromScanner(in));
        return electricBike;
    }
}
