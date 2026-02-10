package com.example.project.two.two;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.example.project.one.Student;

public class ProjectTwoTest {

    @Test
    void testProjectTwo() throws InterruptedException {
        Assertions.assertFalse(Student.class.isInterface());
    }
}
