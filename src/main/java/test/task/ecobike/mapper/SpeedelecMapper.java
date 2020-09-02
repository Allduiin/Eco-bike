package test.task.ecobike.mapper;

import org.springframework.stereotype.Component;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.request.SpeedelecRequestDto;
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

    public String getResponseStringFromSpeedlec(Speedelec bike) {
        SpeedelecResponseDto dto = getSpeedelecResponseDtoFromSpeedelec(bike);
        return "SPEEDELEC " + dto.getBrand() + " with "
                + dto.getBatteryCapacity() + " mAh battery and "
                + (dto.getAvailabilityOfLights() ? "no" : "")
                + " head/tail light.\n" + "Price: " + dto.getPrice()
                + " euros.";
    }

    public Speedelec getSpeedelecFromSpeedelecRequestDto(SpeedelecRequestDto speedelecRequestDto) {
        Speedelec speedelec = new Speedelec();
        speedelec.setBrand(speedelecRequestDto.getBrand());
        speedelec.setPrice(speedelecRequestDto.getPrice());
        speedelec.setColor(speedelecRequestDto.getColor());
        speedelec.setWeight(speedelecRequestDto.getWeight());
        speedelec.setAvailabilityOfLights(speedelecRequestDto.getAvailabilityOfLights());
        speedelec.setBatteryCapacity(speedelecRequestDto.getBatteryCapacity());
        speedelec.setMaxSpeed(speedelecRequestDto.getMaxSpeed());
        return speedelec;
    }
}
