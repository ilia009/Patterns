import static java.util.Objects.isNull;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    private static class Student {

        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student() {

        }

        public String getName() {
            return name;
        }

        public Student setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Student setAge(int age) {
            this.age = age;
            return this;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Student(Student student) {
            this.name = student.getName();
            this.age = student.getAge();
        }

        public Student clone() {
            Student student = new Student();
            student.setName(this.getName());
            student.setAge(this.getAge());
            return student;
        }
    }

    private static class University {

        private List<Student> students = new ArrayList<>();

        public University() {

        }

        public University setStudents(List<Student> students) {
            this.students = students;
            return this;
        }

        public List<Student> getStudents() {
            return students;
        }

        public University(University university) {
            this.students = new ArrayList<Student>();
            this.setStudents(university.getStudents());
        }

        public University clone() {

            University universityCloned = new University();

            for(Student p : this.getStudents())
                universityCloned.getStudents().add(p.clone());

            return universityCloned;
        }

    }


    public static void main(String[] args) throws FileNotFoundException, CloneNotSupportedException {

        List<Student> students = new ArrayList<>();
        students.add(new Student("St1", 22));
        students.add(new Student("St2", 32));

        University university = new University();
        university.setStudents(students);


        University bursa =university.clone();

        System.out.println("university students:");
        System.out.println(university.getStudents());
        System.out.println("bursa students:");
        System.out.println(bursa.getStudents());

       university.getStudents().get(1).setName("aaa");


        System.out.println();
        System.out.println("CHANGES");
        System.out.println();

        System.out.println("university students:");
        System.out.println(university.getStudents());
        System.out.println("bursa students:");
        System.out.println(bursa.getStudents());

    }


}

