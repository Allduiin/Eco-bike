package test.task.eco_bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.task.eco_bike.model.EBike;

public interface EBikeRepository extends JpaRepository<EBike, Long> {
}
