public class School {
    private int number;
    private int year;

    public School(int number, int year) {
        this.number = number;
        this.year = year;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("School №" + number + " " + " of " + year + " year");
    }
}