package Nivell1.Presentation;

import Nivell1.Bussiness.Book;
import Nivell1.Bussiness.BookCollectionManager;
import Nivell1.Bussiness.Collection;
import Nivell1.Persistance.ExceptionEmptyList;
import Nivell1.Persistance.ExceptionMenuCatch;
import Nivell1.Persistance.ExceptonIndexOutOfBounds;

import java.util.ArrayList;
import java.util.Scanner;

public class UIController {
    private MainMenu mainMenu;
    private  static final String emptyList = "No hi ha cap llibre.";

    public UIController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public void start() throws ExceptionMenuCatch, ExceptionEmptyList {
        BookCollectionManager bookCollectionManager = new BookCollectionManager();
        ArrayList<Book> bookArrayList = new ArrayList<>();
        int menuOption = -1;
        do {
            try {
                int option = mainMenu.showMainMenu();
                switch (option) {
                    case 1:
                        bookCollectionManager.addBooks();
                        break;
                    case 2:
                        try {
                           bookArrayList = bookCollectionManager.getBookList();
                           showBookList(bookArrayList);
                        } catch (ExceptionEmptyList e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            getBookByIndex(bookArrayList);
                        } catch (ExceptionEmptyList e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    default:
                        System.out.println("Opció no vàlida.\n");
                }
            } catch (ExceptionMenuCatch e) {
                System.out.println(e.getMessage());
            }
        } while (menuOption != 0);
    }

    private ArrayList<Collection> createCollection(ArrayList<Collection> collections){
        System.out.print("Introdueix el nom de la col·lecció: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        collections.add(new Collection(name));

        return collections;
    }
    private void showBookList(ArrayList<Book> bookArrayList) {
        if(bookArrayList.isEmpty()){
            throw new ExceptionEmptyList(emptyList);
        }else{
            for (Book book : bookArrayList) {
                System.out.println(book);
            }
            System.out.println();
        }
    }

    private void getBookByIndex(ArrayList<Book> bookArrayList) throws ExceptionEmptyList, ExceptonIndexOutOfBounds {
        if (bookArrayList.isEmpty()) {
            throw new ExceptionEmptyList(emptyList);
        } else {
            Scanner scanner = new Scanner(System.in);
            int index = -1;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Introdueix l'índex del llibre: ");
                String input = scanner.nextLine();
                try {
                    index = Integer.parseInt(input);
                    if (index >= 0 && index < bookArrayList.size()) {
                        validInput = true;
                    } else {
                        throw new ExceptonIndexOutOfBounds("L'índex no és vàlid.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Opciò no vàlida.");
                }
            }
            Book book = bookArrayList.get(index);
            System.out.println("Llibre a l'índex " + index + ": " + book + "\n");
        }
    }
}
