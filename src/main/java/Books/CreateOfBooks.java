package Books;

public class CreateOfBooks {
    public static Book[] Create() {
        Book[] books = new Book[10];
        for(int i = 0; i < books.length; i++){
            books[i] = new Book("Book"+i,"author"+1,"gnre"+i,1990+i,34.56*i);
            books[i].setEstate(Estate.Free);
        }
        return books;
    }


}
