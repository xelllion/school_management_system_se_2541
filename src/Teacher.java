import java.util.Objects;

public class Teacher extends Person {

    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher " + name + " " + surname + " is " + age);
    }

    @Override
    public String toString() {
        return "Teacher{name='" + name + "', surname='" + surname + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher t = (Teacher) o;
        return age == t.age &&
                name.equals(t.name) &&
                surname.equals(t.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}

