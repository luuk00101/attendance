import java.util.ArrayList;
import java.util.List;

public class SubjectService {
    private final List<Subject> subjectList;

    public SubjectService() {
        subjectList = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjectList.add(subject);
    }

    public Subject getSubjectById(long id) {
        for (Subject subject : subjectList) {
            if (subject.getId() == id) return subject;
            }

        return null;
    }

    public int getAttendeesCount(long subjectId) {
        Subject subject = getSubjectById(subjectId);

        if (subject == null) return 0;

        return subject.getAttendees().size();
    }
}
