package test.task.eco_bike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.task.eco_bike.model.FoldingBike;

public interface FoldingBikeRepository extends JpaRepository<FoldingBike, Long> {
}
