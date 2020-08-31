package test.task.ecobike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.task.ecobike.model.FoldingBike;

public interface FoldingBikeRepository extends JpaRepository<FoldingBike, Long> {
}
