package Level1Junit;

import Level1Junit.Bussiness.Book;
import Level1Junit.Bussiness.DNICalculator;
import Level1Junit.Bussiness.Library;

import java.util.Scanner;

public class MainLevel1 {
    public static void main(String[] args) {
        System.out.println("----------Exercici1---------");

        final String collection1 = "Tolkien";
        final String collection2 = "Endevé";
        final String collection3 = "Zafón";

        final String title1 = "El senyor dels anells";
        final String title2 = "El Hobbit";
        final String title3 = "La historia interminable";
        final String title6 = "El metge";
        final String title4 = "La sombra del vent";
        final String title5 = "El nom del vent";

        Library col1 = new Library(collection1);
        Library col2 = new Library(collection2);
        Library col3 = new Library(collection3);

        col1.addBook(new Book(title1));
        col1.addBook(new Book(title2));
        col2.addBook(new Book(title3));
        col2.addBook(new Book(title6));
        col3.addBook(new Book(title4));
        col3.addBook(new Book(title5));

        System.out.println("Collections i llibres:");
        System.out.println(col1 + ": ");
        col1.showBooks();
        System.out.println();
        System.out.println(col2 + ": ");
        col2.showBooks();
        System.out.println();
        System.out.println(col3 + ": ");
        col3.showBooks();
        System.out.println();

        System.out.println("Afegit un llibre per index:");
        col1.addBookAtIndex(1, new Book("El Silmarillion"));
        System.out.println(col1 + ": ");
        col1.showBooks();
        System.out.println();

        System.out.println("Llibre eliminat per títol: El Silmarillion");
        col1.removeBookByTitle("El Silmarillion");
        System.out.println(col1 + ": ");
        col1.showBooks();


        System.out.println("\n----------Exercici2---------");

        DNICalculator dniCalculator = new DNICalculator();
        System.out.print("Introdueix numeros del DNI: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int dniNumber = scanner.nextInt();
            System.out.println("La lletra del DNI és: " + dniCalculator.calculateLetter(dniNumber));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}