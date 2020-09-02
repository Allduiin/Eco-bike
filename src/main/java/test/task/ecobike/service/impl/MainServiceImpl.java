package test.task.ecobike.service.impl;

import com.sun.istack.NotNull;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.EBikeMapper;
import test.task.ecobike.mapper.FoldingBikeMapper;
import test.task.ecobike.mapper.SpeedelecMapper;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.abstraction.Bike;
import test.task.ecobike.model.abstraction.ElectricBike;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.MainService;
import test.task.ecobike.service.SpeedelecService;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {

    @Override
    public void search() {

    }

    @Override
    public void writeToFile() {

    }
}
