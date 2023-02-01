package uic.year.feature.year;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Year {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
    private long yearId;
    private String yearSchool;
    
}
