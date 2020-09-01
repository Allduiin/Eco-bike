package test.task.ecobike.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.abstraction.ElectricBike;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.ReadFromFileService;
import test.task.ecobike.service.SpeedelecService;

@AllArgsConstructor
@Service
public class ReadFromFileServiceImpl implements ReadFromFileService {
    private static final String SPEEDELEC_NAME = "SPEEDELEC";
    private static final String E_BIKE_NAME = "E-BIKE";
    private static final String FOLDING_BIKE_NAME = "FOLDING BIKE";
    private EBikeService ebikeService;
    private FoldingBikeService foldingBikeService;
    private SpeedelecService speedelecService;

    @Override
    public void read(String path) throws IOException {
        String line;
        File file = new File(path);
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
            while ((line = br.readLine()) != null) {
                addBikeFromLine(line);
            }
        }
    }

    private void addBikeFromLine(String line) {
        if (line.contains(SPEEDELEC_NAME)) {
            String[] fields = line.substring(SPEEDELEC_NAME.length() + 1).split("; ");
            Speedelec speedelec = (Speedelec) getElectricBikeFromFields(fields, new Speedelec());
            speedelecService.add(speedelec);
        } else if (line.contains(E_BIKE_NAME)) {
            String[] fields = line.substring(E_BIKE_NAME.length() + 1).split("; ");
            EBike ebike = (EBike) getElectricBikeFromFields(fields, new EBike());
            ebikeService.add(ebike);
        } else if (line.contains(FOLDING_BIKE_NAME)) {
            String[] fields = line.substring(FOLDING_BIKE_NAME.length() + 1).split("; ");
            FoldingBike bike = new FoldingBike();
            bike.setBrand(fields[0]);
            bike.setSizeOfTheWheels(Long.parseLong(fields[1]));
            bike.setNumberOfGears(Long.parseLong(fields[2]));
            bike.setWeight(Long.parseLong(fields[3]));
            bike.setAvailabilityOfLights(Boolean.parseBoolean(fields[4]));
            bike.setColor(fields[5]);
            bike.setPrice(Long.parseLong(fields[6]));
            foldingBikeService.add(bike);
        } else {
            throw new RuntimeException("Can't define bike type");
        }

    }

    private ElectricBike getElectricBikeFromFields(String[] fields, ElectricBike bike) {
        bike.setBrand(fields[0]);
        bike.setMaxSpeed(Long.parseLong(fields[1]));
        bike.setWeight(Long.parseLong(fields[2]));
        bike.setAvailabilityOfLights(Boolean.parseBoolean(fields[3]));
        bike.setBatteryCapacity(Long.parseLong(fields[4]));
        bike.setColor(fields[5]);
        bike.setPrice(Long.parseLong(fields[6]));
        return bike;
    }
}
