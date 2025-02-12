public class Book{
    private String Title;
    private String Author;
    private int Year;

    public Book(String title, int year, String author) {
        Title = title;
        Year = year;
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public void bookInfo(){
        System.out.println("Name/Author/Year:"+Title+"/"+Author+"/"+Year);
    }
    public void printBookDetails(){
        System.out.println("Book Details:");
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Year: " + Year);
    }
}

class PrintedBook extends Book{
    private int numbOfPages;
    private String publisher;

    public PrintedBook(String title, int year, String author, int numbOfPages, String publisher) {
        super(title, year, author);
        this.numbOfPages = numbOfPages;
        this.publisher = publisher;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }

    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void bookType(){
        System.out.println("This is a printed book");
    }

    @Override
    public void bookInfo() {
        super.bookInfo();
        System.out.println("Publisher,Numofpages:"+publisher+"/"+numbOfPages);
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of pages: " + numbOfPages);
    }
}

class EBook extends Book{
    private double fileSizeMB;
    private String fileFormat;

    public EBook(String title, int year, String author, double fileSizeMB, String fileFormat) {
        super(title, year, author);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(int fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    public void TypeBook(){
        System.out.println("This is an Ebook");
    }

    @Override
    public void bookInfo() {
        super.bookInfo();
        System.out.println("Size/Format"+fileSizeMB+"/"+fileFormat);
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("File Size: " + fileSizeMB + "MB");
        System.out.println("Format: " + fileFormat);
    }
}

class Testing {
    public static void main(String[] args) {
        System.out.println("    _Наш основной класс_   ");
        Book book = new Book("AIT", 2007, "Elya");
        book.printBookDetails();
        System.out.println("    _Наш подкласс PrintedBook_   ");
        PrintedBook printedBook = new PrintedBook("MagicPower", 2000, "Godjo Satoru", 1587, "Anime");
        printedBook.printBookDetails();
        printedBook.bookType();
        System.out.println("    _Наш подкласс EBook_   ");
        EBook ebook = new EBook("Clean Code", 2008, "Robert C. Martin", 5.2, "PDF");
        ebook.printBookDetails();
        //ebook.bookInfo(); Это тоже самый метод что и сверху.Просто написано так как я хочу. Правда я не знаю зачем. Может я что то неправильно поняла?
        ebook.TypeBook();

    }
}
