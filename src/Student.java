public class Student extends Person {

    private int year;
    private boolean free = true;

    public Student(String id, String name, int year, boolean free) {
        super(id, name);
        this.year = year;
        this.free = free;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.getId() + " " +
                super.getName() + " " +
                "year=" + year +
                ", free=" + free +
                '}';
    }

}
