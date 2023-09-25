package use_case;
import api.GradeDB;
import entity.Grade;
import entity.Team;

public final class GetAverageGradeUseCase {
    private final GradeDB gradeDB;

    public GetAverageGradeUseCase(GradeDB gradeDB) {
        this.gradeDB = gradeDB;
    }

    public float getAverageGrade(String course) {
        float avg = 0.0f;
        int count = 0;
        String[] members = Team.getMembers();
        for (String member:members
             ) {
            Grade grade_inst = GetGradeUseCase.getGrade(member, course);
            int grade = grade_inst.getGrade();
            avg += grade;
            count++;
        }
        return avg/count;
    }
}
