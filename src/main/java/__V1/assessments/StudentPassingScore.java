package __V1.assessments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StudentPassingScore {

    public static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int getScore() {
            return score;
        }

        public String getName() {
            return name;
        }
    }

    public static List<String> studentsThatPass(Stream<Student> students, int passingScore) {

        return students.filter(student -> student.score >= passingScore)
                .sorted((one, other) -> one.score < other.score ? 1 : -1).map(Student::getName).toList();

    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Mike", 80));
        students.add(new Student("James", 57));
        students.add(new Student("Alan", 21));

        studentsThatPass(students.stream(), 50).forEach(System.out::println);
    }
}

