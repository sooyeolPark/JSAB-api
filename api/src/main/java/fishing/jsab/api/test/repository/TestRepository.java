package fishing.jsab.api.test.repository;

import fishing.jsab.api.test.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}

