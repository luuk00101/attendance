import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SubjectServiceTest {

    private SubjectService ss;
    @BeforeEach
    void setUp() {
        ss = new SubjectService();
    }

    @org.junit.jupiter.api.Test
    void getAttendeesCount_empty() {

        Set<Student> students = new HashSet<>();

        Subject subject = new Subject();
        subject.setId(1);

        subject.setAttendees(students);

        assertEquals(0, ss.getAttendeesCount(1));
    }

    @org.junit.jupiter.api.Test
    void getSubjectById_empty() {

        Subject s = new Subject();
        assertNull(ss.getSubjectById(123));
    }

    @Test
    void getAttendeesCount_happypath() {

        Set<Student> students = new HashSet<>();
        students.add(new Student());

        Subject subject = new Subject();
        subject.setId(1);
        subject.setAttendees(students);

        ss.addSubject(subject);

        assertEquals(1, ss.getAttendeesCount(1));
    }
}