package Books;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the library");
        System.out.println("Below we will show you a list of the available books");
        Book[]books = CreateOfBooks.Create();
        System.out.println("**********************************");
        System.out.println("          List of the books       ");
        System.out.println("**********************************");
        for(int i = 0;i<books.length;i++){
            System.out.printf( i+1+") Name:%s, Author: %s, Genere: %s,Year of the publication: %d,Price: %.2f, Estate: %s \n ",books[i].getName(),books[i].getAuthor(),books[i].getGenre(),books[i].getYear_of_publication(),books[i].getPrice(),books[i].getEstate());
        }
        System.out.println("------------------------------------------");
        System.out.println("Choose the book");
        int response = sc.nextInt();
        if(books[response-1].getEstate() == Estate.Reserved){
            System.out.println("The chosen book is already reserved");
        }else {
            books[response-1].setEstate(Estate.Reserved);
        }
        for(int i = 0;i<books.length;i++){
            System.out.printf( i+1+") Name:%s, Author: %s, Genere: %s,Year of the publication: %d,Price: %.2f, Estate: %s \n ",books[i].getName(),books[i].getAuthor(),books[i].getGenre(),books[i].getYear_of_publication(),books[i].getPrice(),books[i].getEstate());
        }

    }
}
