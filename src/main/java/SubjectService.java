import java.util.ArrayList;
import java.util.List;

public class SubjectService {
    public int getAttendeesCount(Subject subject) {
        if (subject == null) return 0;
        return subject.getAttendees().size();
    }
}