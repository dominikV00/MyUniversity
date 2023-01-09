public class Books {

    private String nameOfBook;
    private String authorOfBook;
    private String courseBook;

    public Books(String nameOfBook, String authorOfBook, String courseBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.courseBook = courseBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getCourseBook() {
        return courseBook;
    }

    public void setCourseBook(String courseBook) {
        this.courseBook = courseBook;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                ", courseBook='" + courseBook + '\'' +
                '}';
    }
}
