package test.task.eco_bike.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import test.task.eco_bike.model.abstraction.Bike;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class FoldingBike extends Bike {
    @Id
    private Long id;
    @NotNull
    private Long sizeOfTheWheels;
    @NotNull
    private Long numberOfGears;

    @Override
    public String toString() {
        return "FoldingBike{" +
                "id=" + id +
                ", sizeOfTheWheels=" + sizeOfTheWheels +
                ", numberOfGears=" + numberOfGears +
                "} " + super.toString();
    }
}
