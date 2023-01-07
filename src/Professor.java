import java.util.Arrays;

public class Professor extends Person {

    private Courses [] listofCourses;

    public Professor(String id, String name, Courses[] listofCourses) {
        super(id, name);
        this.listofCourses = listofCourses;
    }

    public Courses[] getListofCourses() {
        return listofCourses;
    }

    public void setListofCourses(Courses[] listofCourses) {
        this.listofCourses = listofCourses;
    }

    @Override
    public String toString() {
        return "Professor{" +
                super.getId() + " " +
                super.getName() + " " +
                "listofCourses=" + Arrays.toString(listofCourses) +
                '}';
    }
}
