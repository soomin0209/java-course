package chapter3.optional.practice;

import java.util.Optional;

public class CampService {

    private Student[] students = {
            new Student("Spartan"),
            new Student("Steve"),
            new Student("John")
    };

    public Optional<Student> findStudent(String name) {
        for (Student student : students) {
            String studentName = student.getName();
            if (studentName.equals(name)) {
                return Optional.ofNullable(student);
            }
        }
        return Optional.ofNullable(null);
    }
}
