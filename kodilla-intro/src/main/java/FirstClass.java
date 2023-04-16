import javax.swing.*;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello from FirstClass!");

        Notebook notebook = new Notebook(600, 600, 2020);
//        System.out.println("notebook.weight: " + notebook.weight);
//        System.out.println("notebook.price: " + notebook.price);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(2000, 1400, 2023);
//        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight);
//        System.out.println("heavyNotebook.price: " + heavyNotebook.price);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(1200, 450, 2015);
//        System.out.println("oldNotebook.weight: " + oldNotebook.weight);
//        System.out.println("oldNotebook.price: " + oldNotebook.price);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
//        System.out.println(notebook.weight + " " + notebook.price + " " + heavyNotebook.price);
    }

    }