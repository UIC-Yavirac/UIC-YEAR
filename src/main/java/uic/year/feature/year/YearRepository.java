package uic.year.feature.year;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface YearRepository extends CrudRepository<Year, Long> {

    List<Year> findAll();
}
