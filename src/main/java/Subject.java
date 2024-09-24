import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Subject {
    private long id;
    private String name;
    private int year;
    private Set<Student> attendees;
}
