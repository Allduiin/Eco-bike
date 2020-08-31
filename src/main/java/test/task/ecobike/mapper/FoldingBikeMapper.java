package test.task.ecobike.mapper;

import org.springframework.stereotype.Component;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.dto.response.FoldingBikeResponseDto;

@Component
public class FoldingBikeMapper {

    public String getResponseStringFromFoldingBike(FoldingBike bike) {
        FoldingBikeResponseDto dto = getFoldingBikeResponseDtoFromFoldingBike(bike);
        return "FOLDING dto " + dto.getBrand() + " with "
                + dto.getNumberOfGears() + " gear(s) and "
                + ((dto.getAvailabilityOfLights()) ? "no" : "")
                + " head/tail light.\n" + "Price: " + dto.getPrice()
                + " euros.";
    }

    public FoldingBikeResponseDto getFoldingBikeResponseDtoFromFoldingBike(FoldingBike bike) {
        FoldingBikeResponseDto dto = new FoldingBikeResponseDto();
        dto.setBrand(bike.getBrand());
        dto.setAvailabilityOfLights(bike.getAvailabilityOfLights());
        dto.setNumberOfGears(bike.getNumberOfGears());
        dto.setPrice(bike.getPrice());
        return dto;
    }
}
