package edu.course.studentorder.validator;

import edu.course.studentorder.domain.AnswerStudent;
import edu.course.studentorder.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student check");
        return new AnswerStudent();
    }
}
