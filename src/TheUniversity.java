import java.rmi.AlreadyBoundException;

public class TheUniversity {

    private final int MAXCOURSES = 8;
    private Courses[] CoursesInUniversity = new Courses[MAXCOURSES];
    private final int MAXPERSON = 20;
    private Person[] PersonInUniversity = new Person[MAXPERSON];

    private void addCourses() {
        CoursesInUniversity[0] = new Courses("English",1,false);
        CoursesInUniversity[1] = new Courses("Engineering",1,true);
        CoursesInUniversity[2] = new Courses("Physics",1,true);
        CoursesInUniversity[3] = new Courses("Computing and IT",2,true);
        CoursesInUniversity[4] = new Courses("Creative Arts",2,false);
        CoursesInUniversity[5] = new Courses("Mathematics",2,true);


    }

    private void addPerson() {
        PersonInUniversity[0]=new Student("0001","Alex",1,false);
        PersonInUniversity[1]=new Student("0002","Sofia",1,true);
        PersonInUniversity[2]=new Student("0003","Natalie",2,true);
        PersonInUniversity[3]=new Student("0004","George",2,true);
        PersonInUniversity[4]=new Student("0005","Luis",2,false);
        PersonInUniversity[5]=new Student("0006","Anne",2,true);

    }


    public static void main(String[] args) {

        TheUniversity uni = new TheUniversity();
        uni.addCourses();
        uni.addPerson();

    }
}