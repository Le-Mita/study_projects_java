package edu.course.studentorder.validator;

import edu.course.studentorder.domain.AnswerChildren;
import edu.course.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children check is running");
        return new AnswerChildren();
    }
}
