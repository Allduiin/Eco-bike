package test.task.ecobike.service.console.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
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
import test.task.ecobike.service.SpeedelecService;
import test.task.ecobike.service.console.WriteToFileService;

@Service
@AllArgsConstructor
public class WriteToFileServiceImpl implements WriteToFileService {
    private final EBikeService ebikeService;
    private final FoldingBikeService foldingBikeService;
    private final SpeedelecService speedelecService;
    private final EBikeMapper ebikeMapper;
    private final FoldingBikeMapper foldingBikeMapper;
    private final SpeedelecMapper speedelecMapper;

    @Override
    public void writeToFile() {
        System.out.println("Please enter name of file to create and add data or "
                + "it's paths to add data(without type)");
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File file = new File(path + ".txt");
        List<EBike> ebikes = ebikeService.getAll();
        List<FoldingBike> foldingBikes = foldingBikeService.getAll();
        List<Speedelec> speedelecs = speedelecService.getAll();

        StringJoiner mainJoiner = new StringJoiner("\n");
        for (EBike bike: ebikes) {
            mainJoiner.add("E-BIKE " + ebikeMapper.convertEBikeToString(bike));
        }
        for (FoldingBike bike: foldingBikes) {
            mainJoiner.add("FOLDING BIKE " + foldingBikeMapper.convertFoldingBikeToString(bike));
        }
        for (Speedelec bike: speedelecs) {
            mainJoiner.add("SPEEDELEC " + speedelecMapper.convertSpeedelecToString(bike));
        }

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.print(mainJoiner.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not existing", e);
        }
    }
}
