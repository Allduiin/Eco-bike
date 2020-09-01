package test.task.ecobike;

import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.request.EBikeRequestDto;
import test.task.ecobike.model.dto.request.FoldingBikeRequestDto;
import test.task.ecobike.model.dto.request.SpeedelecRequestDto;
import test.task.ecobike.service.EBikeService;
import test.task.ecobike.service.FoldingBikeService;
import test.task.ecobike.service.MainService;
import test.task.ecobike.service.ReadFromFileService;
import test.task.ecobike.service.SpeedelecService;

@SpringBootApplication
public class EcoBikeApplication {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(EcoBikeApplication.class, args);
        run.getBean(ReadFromFileService.class)
                .read("D:\\Java\\ecobike\\src\\main\\resources\\TestFile.txt");
        FoldingBikeService foldingBikeService = run.getBean(FoldingBikeService.class);
        SpeedelecService speedelecService = run.getBean(SpeedelecService.class);
        EBikeService ebikeService = run.getBean(EBikeService.class);

        FoldingBikeRequestDto foldingBikeRequestDto = new FoldingBikeRequestDto();
        foldingBikeRequestDto.setAvailabilityOfLights(true);
        System.out.println(foldingBikeService.getByParams(foldingBikeRequestDto));

        EBikeRequestDto ebikeRequestDto = new EBikeRequestDto();
        ebikeRequestDto.setAvailabilityOfLights(true);
        System.out.println(ebikeService.getByParams(ebikeRequestDto));

        SpeedelecRequestDto speedelecRequestDto = new SpeedelecRequestDto();
        speedelecRequestDto.setAvailabilityOfLights(true);
        System.out.println(speedelecService.getByParams(speedelecRequestDto));
    }
}
