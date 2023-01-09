public class PaperBooks extends Books {

    private String inventoryNr;

    public PaperBooks(String nameOfBook, String authorOfBook, String courseBook, String inventoryNr) {
        super(nameOfBook, authorOfBook, courseBook);
        this.inventoryNr = inventoryNr;
    }

    public String getInventoryNr() {
        return inventoryNr;
    }

    public void setInventoryNr(String inventoryNr) {
        this.inventoryNr = inventoryNr;
    }

    @Override
    public String toString() {
        return "PaperBooks{" +
                super.getNameOfBook() + " " +
                "by " + super.getAuthorOfBook() + " " +
                ", book for: " + super.getCourseBook() + " " +
                ", inventoryNr='" + inventoryNr + '\'' +
                '}';
    }

}
