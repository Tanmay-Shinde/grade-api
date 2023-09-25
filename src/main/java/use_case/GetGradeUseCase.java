package use_case;

import entity.Grade;
import api.GradeDB;

public final class GetGradeUseCase {
    private static GradeDB gradeDB = null;

    public GetGradeUseCase(GradeDB gradeDB) {
        GetGradeUseCase.gradeDB = gradeDB;
    }

    public static Grade getGrade(String utorid, String course) {
        return gradeDB.getGrade(utorid, course);
    }
}
