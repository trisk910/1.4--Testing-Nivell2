package Nivell1.Presentation;

import Nivell1.Bussiness.Book;
import Nivell1.Bussiness.Collection;
import Nivell1.Persistance.ExceptionEmptyList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UIController {
    private MainMenu mainMenu;
    private  static final String emptyList = "No existeix cap col·lecció.";

    public UIController(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public void start(){
        ArrayList<Collection> collections = new ArrayList<>();
        int menuOption = 0;
        do {
            try {
                menuOption = mainMenu.showMainMenu();
                switch (menuOption) {
                    case 1:
                        createCollection(collections);
                        break;
                    case 2:
                        showCollections(collections);
                        break;
                    case 3:
                        createBook(collections);
                        break;
                    default:
                        System.err.println("Opció no vàlida.\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (menuOption != 0);
    }

    private void createCollection(ArrayList<Collection> collections){
        System.out.print("Introdueix el nom de la col·lecció: ");
        String name = askForString();
        collections.add(new Collection(name));
    }
    private void showCollections(ArrayList<Collection> collections) throws ExceptionEmptyList {
        boolean emptyList = checkEmptyList(collections);
        if (!emptyList) {
           System.out.println(collections);
        }
        System.out.println();
    }

    private void createBook(ArrayList<Collection> collections) throws ExceptionEmptyList {
        boolean emptyList = checkEmptyList(collections);
        if (!emptyList) {
            System.out.print("Introdueix el nom de la col·lecció: ");
            String name = askForString();
            boolean found = false;
            for(int i = 0; i<collections.size();i++){
                if(collections.get(i).getName().equals(name)){
                    found = true;
                    System.out.print("Introdueix el titol del llibre: ");
                    String title = askForString();
                    i = collections.size();
                    collections.get(i).addBook(new Book(title));
                }
            }
            if(!found){
                System.out.println("No existeix cap col·lecció amb aquest nom.");
            }
        }
        System.out.println();
    }

    private boolean checkEmptyList(ArrayList<Collection> collections) throws ExceptionEmptyList {
       boolean empty = false;
        if (collections.isEmpty()) {
            empty = true;
            throw new ExceptionEmptyList(emptyList);
        }
        return empty;
    }
    private String askForString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private int askForInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
