import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // School
        School school = new School(17, 1998);
        school.displayInfo();

        // Data pool
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Aruzhan", "Amerkhanova", 18));
        people.add(new Student("Dana", "Khan", 20));
        people.add(new Teacher("Amirkhan", "Tulkibayev", 40));

        System.out.println("\n--- Polymorphism ---");
        for (Person p : people) {
            p.displayInfo();
        }

        System.out.println("\n--- Searching ---");
        for (Person p : people) {
            if (p.getName().equals("Aruzhan")) {
                System.out.println("Found: " + p);
            }
        }

        System.out.println("\n--- Filtering (Students only) ---");
        for (Person p : people) {
            if (p instanceof Student) {
                p.displayInfo();
            }
        }

        System.out.println("\n--- Sorting by age ---");
        people.sort(Comparator.comparing(Person::getAge));
        for (Person p : people) {
            p.displayInfo();
        }
    }
}
