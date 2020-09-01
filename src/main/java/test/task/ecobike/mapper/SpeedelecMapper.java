package test.task.ecobike.mapper;

import org.springframework.stereotype.Component;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.response.SpeedelecResponseDto;

@Component
public class SpeedelecMapper {
    public SpeedelecResponseDto getSpeedelecResponseDtoFromSpeedelec(Speedelec bike) {
        SpeedelecResponseDto dto = new SpeedelecResponseDto();
        dto.setBrand(bike.getBrand());
        dto.setAvailabilityOfLights(bike.getAvailabilityOfLights());
        dto.setBatteryCapacity(bike.getBatteryCapacity());
        dto.setPrice(bike.getPrice());
        return dto;
    }

    public String getSpeedlecResponseStringFromSpeedlec(Speedelec bike) {
        SpeedelecResponseDto dto = getSpeedelecResponseDtoFromSpeedelec(bike);
        return "SPEEDELEC " + dto.getBrand() + " with "
                + dto.getBatteryCapacity() + " mAh battery and"
                + (dto.getAvailabilityOfLights() ? "no" : "")
                + " head/tail light.\n" + "Price: " + dto.getPrice()
                + " euros.";
    }

}
