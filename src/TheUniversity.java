import java.rmi.AlreadyBoundException;

public class TheUniversity {

    private final int MAXCOURSES = 8;
    private Courses[] CoursesInUniversity = new Courses[MAXCOURSES];
    private final int MAXPERSON = 20;
    private Person[] PersonInUniversity = new Person[MAXPERSON];
    private final int MAXBOOKS = 20;
    private Books[] BooksOfUniversity = new Books[MAXBOOKS];

    private void addCourses() {
        CoursesInUniversity[0] = new Courses("English", 1, false);
        CoursesInUniversity[1] = new Courses("Engineering", 1, true);
        CoursesInUniversity[2] = new Courses("Physics", 1, true);
        CoursesInUniversity[3] = new Courses("Computing and IT", 2, true);
        CoursesInUniversity[4] = new Courses("Creative Arts", 2, false);
        CoursesInUniversity[5] = new Courses("Mathematics", 2, true);


    }

    private void addPerson() {
        PersonInUniversity[0] = new Student("0001", "Alex", 1, false);
        PersonInUniversity[1] = new Student("0002", "Sofia", 1, true);
        PersonInUniversity[2] = new Student("0003", "Natalie", 2, true);
        PersonInUniversity[3] = new Student("0004", "George", 2, true);
        PersonInUniversity[4] = new Student("0005", "Luis", 2, false);
        PersonInUniversity[5] = new Student("0006", "Anne", 2, true);
        Courses[] ct1 = {CoursesInUniversity[0], CoursesInUniversity[4]};
        Courses[] ct2 = {CoursesInUniversity[3], CoursesInUniversity[2]};
        Courses[] ct3 = {CoursesInUniversity[3], CoursesInUniversity[5]};
        PersonInUniversity[6] = new Professor("9991", "Mr.Alexander", ct1);
        PersonInUniversity[7] = new Professor("9992", "Mrs.Rose", ct2);
        PersonInUniversity[8] = new Professor("9993", "Mr.Harper", ct3);

    }

    private void listCourses() {
        System.out.println("List of the current courses in the university:");
        for (int i = 0; CoursesInUniversity.length > i; i++) {
            if (CoursesInUniversity[i] != null) {
                System.out.println(CoursesInUniversity[i].toString());
            }

        }
        System.out.println(" ");
    }

    private void listPerson() {
        System.out.println("List of the current persons in the university:");
        for (int i = 0; PersonInUniversity.length > i; i++) {
            if (PersonInUniversity[i] != null) {
                System.out.println(PersonInUniversity[i].toString());
            }
        }
        System.out.println(" ");
    }

    private void addBooks() {
        BooksOfUniversity[0] = new PaperBooks("English book", "ELOISE CASTILLO", "English", "0072");
        BooksOfUniversity[1] = new PaperBooks("Engineering book", "GINA SHAW", "Engineering", "0054");
        BooksOfUniversity[2] = new Ebook("Physics book", "YOLANDA ALEXANDER", "Physics");
        BooksOfUniversity[3] = new Ebook("Computing and IT book", "PRISCILLA GLISSON", "Computing and IT");
        BooksOfUniversity[4] = new PaperBooks("Creative Arts book", "ROBIN ALVARADO", "Creative Arts", "0023");
        BooksOfUniversity[5] = new Ebook("Mathematics book", "MIRANDA SALAZAR", "Mathematics");
    }

    private void listBooks() {
        System.out.println("List of the current books of the university:");
        for (int i = 0; BooksOfUniversity.length > i; i++) {
            if (BooksOfUniversity[i] != null) {
                System.out.println(BooksOfUniversity[i].toString());
            }
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        TheUniversity uni = new TheUniversity();
        uni.addCourses();
        uni.addPerson();
        uni.listPerson();
        uni.listCourses();
        uni.addBooks();
        uni.listBooks();

    }
}