import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SubjectServiceTest {


    @org.junit.jupiter.api.Test
    void getAttendeesCount_empty() {
        SubjectService ss = new SubjectService();

        Set<Student> students = new HashSet<>();

        Subject subject = new Subject();
        subject.setId(1);

        subject.setAttendees(students);

        assertEquals(0, ss.getAttendeesCount(1));
    }
}