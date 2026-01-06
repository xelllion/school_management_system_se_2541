public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;

    public Person(String name,String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
