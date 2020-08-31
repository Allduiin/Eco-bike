package test.task.ecobike.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.EBikeMapper;
import test.task.ecobike.mapper.FoldingBikeMapper;
import test.task.ecobike.mapper.SpeedelecMapper;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.MainService;
import test.task.ecobike.service.SpeedelecService;

@Service
@AllArgsConstructor
public class MainServiceImpl implements MainService {
    private final EBikeService ebikeService;
    private final FoldingBikeService foldingBikeService;
    private final SpeedelecService speedelecService;
    private final EBikeMapper ebikeMapper;
    private final FoldingBikeMapper foldingBikeMapper;
    private final SpeedelecMapper speedelecMapper;

    @Override
    public void showCatalog() {
        for(EBike bike: ebikeService.getAll()) {
            System.out.println(ebikeMapper.getResponseStringFromEBike(bike));
        }
        for(FoldingBike bike: foldingBikeService.getAll()) {
            System.out.println(foldingBikeMapper.getResponseStringFromFoldingBike(bike));
        }
        for(Speedelec bike: speedelecService.getAll()) {
            System.out.println(speedelecMapper.getSpeedlecResponseStringFromSpeedlec(bike));
        }
    }

    @Override
    public void addNewFoldingBike() {

    }

    @Override
    public void addNewSpeedelec() {

    }

    @Override
    public void addNewEBike() {

    }

    @Override
    public void search() {

    }

    @Override
    public void writeToFile() {

    }
}
