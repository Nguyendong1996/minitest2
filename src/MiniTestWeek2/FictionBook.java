package MiniTestWeek2;

public class FictionBook extends ProgrammingBook{
    String category;

    public FictionBook(int bookCode, String name, double price, String author, String language, String framework, String category) {
        super(bookCode, name, price, author, language, framework);
        this.category = category;
    }

    public FictionBook(String language, String framework, String category) {
        super(language, framework);
        this.category = category;
    }

    public FictionBook(String language, String framework) {
        super(language, framework);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                ", bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
