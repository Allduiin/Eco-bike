package test.task.ecobike.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.task.ecobike.model.Speedelec;

public interface SpeedelecRepository extends JpaRepository<Speedelec, Long> {
}
