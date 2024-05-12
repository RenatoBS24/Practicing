package Books;

public class Book {
    private String name,author,genre;
    private int year_of_publication;
    private double price;
    private Estate estate;

    public Estate getEstate() {
        return estate;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }

    public Book(String name, String author, String genre, int year_of_publication, double price) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year_of_publication = year_of_publication;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear_of_publication() {
        return year_of_publication;
    }

    public void setYear_of_publication(int year_of_publication) {
        this.year_of_publication = year_of_publication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
