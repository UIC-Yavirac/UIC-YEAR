package uic.year.feature.year;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class YearService {
    @Autowired
    YearRepository yearRepository;

    @Transactional
    public Year save(Year entity) {
        return yearRepository.save(entity);
    }

    public Year findById(Long id) {
        return yearRepository.findById(id).orElse(new Year());
    }

    public void deleteById(Long id) {
        yearRepository.deleteById(id);
    }

    public List<Year> findAll() {
        return yearRepository.findAll();
    }
}
