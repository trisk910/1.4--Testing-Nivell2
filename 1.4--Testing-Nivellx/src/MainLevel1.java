import Nivell1.Bussiness.BookCollectionManager;
import Nivell1.Presentation.MainMenu;
import Nivell1.Presentation.UIController;

public class MainLevel1 {
    public static void main(String[] args) {

        System.out.println("----------Exercici1---------");
        MainMenu mainMenu = new MainMenu();
        UIController uiController = new UIController(mainMenu);
        uiController.start();



        System.out.println("----------Exercici2---------");


    }
}