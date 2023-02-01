package uic.year.feature.year;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/year")
@CrossOrigin({ "*" })

public class YearController {

    @Autowired
    YearService yearService;

    @GetMapping("/{id}/")
    public Year findById(@PathVariable Long id) {
        return yearService.findById(id);
    }

    @GetMapping("/")
    public List<Year> findAll() {
        return yearService.findAll();
    }

    @PostMapping("/")
    public Year save(@RequestBody Year entity) {
        return yearService.save(entity);
    }

    @PutMapping("/{id}/")
    public Year update(@RequestBody Year entity) {
        return yearService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        yearService.deleteById(id);
    }
    
}
