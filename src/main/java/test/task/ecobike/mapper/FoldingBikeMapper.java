package test.task.ecobike.mapper;

import java.util.StringJoiner;
import org.springframework.stereotype.Component;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.dto.request.FoldingBikeRequestDto;
import test.task.ecobike.model.dto.response.FoldingBikeResponseDto;

@Component
public class FoldingBikeMapper {

    public FoldingBikeResponseDto getFoldingBikeResponseDtoFromFoldingBike(FoldingBike bike) {
        FoldingBikeResponseDto dto = new FoldingBikeResponseDto();
        dto.setBrand(bike.getBrand());
        dto.setAvailabilityOfLights(bike.getAvailabilityOfLights());
        dto.setNumberOfGears(bike.getNumberOfGears());
        dto.setPrice(bike.getPrice());
        return dto;
    }

    public String getResponseStringFromFoldingBike(FoldingBike bike) {
        FoldingBikeResponseDto dto = getFoldingBikeResponseDtoFromFoldingBike(bike);
        return "FOLDING BIKE " + dto.getBrand() + " with "
                + dto.getNumberOfGears() + " gear(s) and "
                + (dto.getAvailabilityOfLights() ? "no" : "")
                + " head/tail light.\n" + "Price: " + dto.getPrice()
                + " euros.";
    }

    public FoldingBike getFoldingBikeFromFoldingBikeRequest(
            FoldingBikeRequestDto foldingBikeRequestDto) {
        FoldingBike foldingBike = new FoldingBike();
        foldingBike.setBrand(foldingBikeRequestDto.getBrand());
        foldingBike.setPrice(foldingBikeRequestDto.getPrice());
        foldingBike.setColor(foldingBikeRequestDto.getColor());
        foldingBike.setWeight(foldingBikeRequestDto.getWeight());
        foldingBike.setAvailabilityOfLights(foldingBikeRequestDto.getAvailabilityOfLights());
        foldingBike.setNumberOfGears(foldingBikeRequestDto.getNumberOfGears());
        foldingBike.setSizeOfTheWheels(foldingBikeRequestDto.getSizeOfTheWheels());
        return foldingBike;
    }

    public String convertFoldingBikeToString(FoldingBike bike) {
        StringJoiner joiner = new StringJoiner("; ");
        joiner.add(bike.getBrand());
        joiner.add(bike.getSizeOfTheWheels().toString());
        joiner.add(bike.getNumberOfGears().toString());
        joiner.add(bike.getWeight().toString());
        joiner.add(bike.getAvailabilityOfLights().toString());
        joiner.add(bike.getColor());
        joiner.add(bike.getPrice().toString());
        return joiner.toString();
    }
}
