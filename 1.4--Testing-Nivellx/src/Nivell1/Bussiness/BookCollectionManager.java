package Nivell1.Bussiness;

import Nivell1.Persistance.ExceptionEmptyList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class BookCollectionManager {
    private ArrayList<Book> bookArrayList;

    public BookCollectionManager() {
        bookArrayList = new ArrayList<>();
    }

    public void addBooks( Collection collection) {
        System.out.print("Introdueix el titol del llibre: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        bookArrayList.add(new Book( title ));
    }

    public ArrayList<Book> getBookList(){
        return bookArrayList;
    }

    public int getIndexBook( Book book ) {////////
        return bookArrayList.indexOf( book );
    }

    public void addBookOnIndex(){

    }

    public void deleteBookByTitle(){

    }

}
