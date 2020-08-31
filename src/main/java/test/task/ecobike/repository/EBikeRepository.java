package test.task.ecobike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.task.ecobike.model.EBike;

public interface EBikeRepository extends JpaRepository<EBike, Long> {
}
