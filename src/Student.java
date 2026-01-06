import java.util.Objects;

public class Student extends Person {
    public Student(String name, String surname, int age) {
        super(name, surname,age);
    }
    @Override
    public void displayInfo() {
        System.out.println("Student " + name + " " + surname + " is " + age);
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + surname + ", age " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return age == s.age && name.equals(s.name) && surname.equals(s.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}