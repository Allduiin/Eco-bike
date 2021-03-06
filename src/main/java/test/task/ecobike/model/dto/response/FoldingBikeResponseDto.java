package test.task.ecobike.model.dto.response;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import test.task.ecobike.model.dto.response.abstraction.BikeResponseDto;

@EqualsAndHashCode(callSuper = true)
@Data
public class FoldingBikeResponseDto extends BikeResponseDto {
    @NotNull
    private Long numberOfGears;
}
