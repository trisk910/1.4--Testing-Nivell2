package Nivell1.Presentation;

import java.util.Scanner;

public class MainMenu {

    public int showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("1.- Crear Col·lecció.");
            System.out.println("2.- Mostrar Col·leccions.");
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
