package test.task.ecobike.service.console.impl;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.EBikeMapper;
import test.task.ecobike.mapper.FoldingBikeMapper;
import test.task.ecobike.mapper.SpeedelecMapper;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.request.EBikeRequestDto;
import test.task.ecobike.model.dto.request.FoldingBikeRequestDto;
import test.task.ecobike.model.dto.request.SpeedelecRequestDto;
import test.task.ecobike.model.dto.request.abstraction.ElectricBikeRequestDto;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.SpeedelecService;
import test.task.ecobike.service.console.SearchService;

@Service
@AllArgsConstructor
public class SearchServiceImpl implements SearchService {
    private final EBikeService ebikeService;
    private final FoldingBikeService foldingBikeService;
    private final SpeedelecService speedelecService;
    private final EBikeMapper ebikeMapper;
    private final FoldingBikeMapper foldingBikeMapper;
    private final SpeedelecMapper speedelecMapper;

    public void search(Scanner in) {
        System.out.println("Please write type of bike that you want to search"
                + "as written here: e-bike, speedelec, folding bike");

        try {
            while (true) {
                switch (in.nextLine()) {
                    case ("e-bike"):
                        searchEBike(in);
                        return;
                    case ("speedelec"):
                        searchSpeedelec(in);
                        return;
                    case ("folding bike"):
                        searchFoldingBike(in);
                        return;
                    case ("/exit"):
                        return;
                    default:
                        System.out.println("not detected type of bikes, please try again");
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("No bikes like this, sorry you can try find "
                    + "something else or write command \"/exit\"");
        }
    }

    private void searchSpeedelec(Scanner in) {
        SpeedelecRequestDto speedelecRequestDto = new SpeedelecRequestDto();
        addElectricBikeParams(speedelecRequestDto, in);
        List<Speedelec> bikes = speedelecService.getByParams(speedelecRequestDto);
        for (Speedelec bike : bikes) {
            System.out.println(speedelecMapper.getResponseStringFromSpeedlec(bike));
        }
    }

    private void searchEBike(Scanner in) {
        EBikeRequestDto ebikeRequestDto = new EBikeRequestDto();
        addElectricBikeParams(ebikeRequestDto, in);
        List<EBike> bikes = ebikeService.getByParams(ebikeRequestDto);
        for (EBike bike : bikes) {
            System.out.println(ebikeMapper.getResponseStringFromEBike(bike));
        }
    }

    private void searchFoldingBike(Scanner in) {
        System.out.println("Please write the parameters that you want by what you want search"
                + " one by one like is written here:\nBrand, Price, Color, Availability Of Lights,"
                + " Number of gears, Weight, Size of wheels, Number of gears\n"
                + "And write it , if you want to search write \"search\" if you want search");
        FoldingBikeRequestDto requestDto = new FoldingBikeRequestDto();
        try {
            loop:
            while (true) {
                switch (in.nextLine()) {
                    case ("Brand"):
                        requestDto.setBrand(in.nextLine());
                        break;
                    case ("Price"):
                        requestDto.setPrice(in.nextLong());
                        break;
                    case ("Color"):
                        requestDto.setColor(in.nextLine());
                        break;
                    case ("Availability of lights"):
                        requestDto.setAvailabilityOfLights(in.nextBoolean());
                        break;
                    case ("Weight"):
                        requestDto.setWeight(in.nextLong());
                        break;
                    case ("Size of wheels"):
                        requestDto.setSizeOfTheWheels(in.nextLong());
                        break;
                    case ("Number of gears"):
                        requestDto.setNumberOfGears(in.nextLong());
                        break;
                    case ("search"):
                        List<FoldingBike> bikes = foldingBikeService.getByParams(requestDto);
                        for (FoldingBike bike : bikes) {
                            System.out.println(foldingBikeMapper
                                    .getResponseStringFromFoldingBike(bike));
                        }
                        break loop;
                    default:
                        System.out.println("Parameter not detected, please try again");
                }
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Incorrect param was written");
            searchFoldingBike(in);
        }
    }

    private ElectricBikeRequestDto addElectricBikeParams(
            ElectricBikeRequestDto electricBikeRequestDto,
            Scanner in) {
        System.out.println("Please write the parameters that you want by what you want "
                + "search one by one\nlike is written here: Brand, Price, Color, Battery "
                + "capacity, Max speed, Weight\n"
                + "And write it , if you want to search write \"search\" "
                + "if you want search");
        try {
            loop:
            while (true) {
                switch (in.nextLine()) {
                    case ("Brand"):
                        electricBikeRequestDto.setBrand(in.nextLine());
                        System.out.println("Brand was added");
                        break;
                    case ("Price"):
                        electricBikeRequestDto.setPrice(in.nextLong());
                        System.out.println("Price was added");
                        break;
                    case ("Color"):
                        electricBikeRequestDto.setColor(in.nextLine());
                        System.out.println("Color was added");
                        break;
                    case ("Availability of lights"):
                        electricBikeRequestDto.setAvailabilityOfLights(in.nextBoolean());
                        System.out.println("Availability of lights was added");
                        break;
                    case ("Weight"):
                        electricBikeRequestDto.setWeight(in.nextLong());
                        System.out.println("Weight was added");
                        break;
                    case ("Battery capacity"):
                        electricBikeRequestDto.setBatteryCapacity(in.nextLong());
                        System.out.println("Battery capacity was added");
                        break;
                    case ("Max speed"):
                        electricBikeRequestDto.setMaxSpeed(in.nextLong());
                        System.out.println("Max speed was added");
                        break;
                    case ("search"):
                        break loop;
                    default:
                        System.out.println("Parameter not detected, please try again");
                }
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Incorrect param was written");
            searchFoldingBike(in);
        }
        return electricBikeRequestDto;
    }
}
