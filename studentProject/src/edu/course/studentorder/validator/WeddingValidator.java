package edu.course.studentorder.validator;

import edu.course.studentorder.domain.AnswerWedding;
import edu.course.studentorder.domain.StudentOrder;

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding is running");
        return new AnswerWedding();
    }
}
