public class Ebook extends Books {

    public Ebook(String nameOfBook, String authorOfBook, String courseBook) {
        super(nameOfBook, authorOfBook, courseBook);
    }

    @Override
    public String toString() {
        return "Ebook{" +
                super.getNameOfBook() + " " +
                "by " + super.getAuthorOfBook() + " " +
                ", book for: " + super.getCourseBook() + " " +
                '}';
    }

}
