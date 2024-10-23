package Nivell1.Presentation;

import Nivell1.Persistance.ExceptionMenuCatch;

import java.util.Scanner;

public class MainMenu {

    public int showMainMenu() throws ExceptionMenuCatch {
        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("1.- Introduir Llibre.");
            System.out.println("2.- Mostrar llista de llibres.");
            System.out.println("3.- Mostrar llibre per index.");
            System.out.println("4.- Afegir llibre per index.");
            System.out.println("5.- Eliminar llibre per titol.");
            System.out.println("0.- Sortir.");

            System.out.print("Opcio: ");
            String input = scanner.nextLine();
            try {
                menuOption = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Opció no disponible.\n");
            }
        }
        System.out.println();
        return menuOption;
    }
}
