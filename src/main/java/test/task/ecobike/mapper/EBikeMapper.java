package test.task.ecobike.mapper;

import java.util.StringJoiner;
import org.springframework.stereotype.Component;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.dto.request.EBikeRequestDto;
import test.task.ecobike.model.dto.response.EBikeResponseDto;

@Component
public class EBikeMapper {

    public EBikeResponseDto getEBikeResponseDtoFromEBike(EBike ebike) {
        EBikeResponseDto dto = new EBikeResponseDto();
        dto.setBrand(ebike.getBrand());
        dto.setAvailabilityOfLights(ebike.getAvailabilityOfLights());
        dto.setBatteryCapacity(ebike.getBatteryCapacity());
        dto.setPrice(ebike.getPrice());
        return dto;
    }

    public String getResponseStringFromEBike(EBike ebike) {
        EBikeResponseDto dto = getEBikeResponseDtoFromEBike(ebike);
        return "E-BIKE " + dto.getBrand() + " with "
                + dto.getBatteryCapacity() + " mAh battery and "
                + (dto.getAvailabilityOfLights() ? "no" : "")
                + " head/tail light.\n" + "Price: " + dto.getPrice()
                + " euros.";
    }

    public EBike getEBikeFromEBikeRequestDto(EBikeRequestDto ebikeRequestDto) {
        EBike bike = new EBike();
        bike.setBrand(ebikeRequestDto.getBrand());
        bike.setPrice(ebikeRequestDto.getPrice());
        bike.setColor(ebikeRequestDto.getColor());
        bike.setWeight(ebikeRequestDto.getWeight());
        bike.setAvailabilityOfLights(ebikeRequestDto.getAvailabilityOfLights());
        bike.setBatteryCapacity(ebikeRequestDto.getBatteryCapacity());
        bike.setMaxSpeed(ebikeRequestDto.getMaxSpeed());
        return bike;
    }

    public String convertEBikeToString(EBike bike) {
        StringJoiner joiner = new StringJoiner("; ");
        joiner.add(bike.getBrand());
        joiner.add(bike.getMaxSpeed().toString());
        joiner.add(bike.getWeight().toString());
        joiner.add(bike.getAvailabilityOfLights().toString());
        joiner.add(bike.getBatteryCapacity().toString());
        joiner.add(bike.getColor());
        joiner.add(bike.getPrice().toString());
        return joiner.toString();
    }
}
