import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


@Data
public class Student {
    private long id;
    private String first_name;
    private String last_name;
    private Gender gender;
    private LocalDate birth_date;
}
