public class Courses {

    private String nameCourse;
    private int year;
    private boolean mandatory = true;

    public Courses(String nameCourse, int year, boolean mandatory) {
        this.nameCourse = nameCourse;
        this.year = year;
        this.mandatory = mandatory;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "nameCourse='" + nameCourse + '\'' +
                ", year=" + year +
                ", mandatory=" + mandatory +
                '}';
    }
}
