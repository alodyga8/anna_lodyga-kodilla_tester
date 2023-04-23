import java.util.Scanner;

public class Colours {

    public static void main(String[] args) {
        String chosenColour = getColourLetter();
        System.out.println("Your colour is: " +chosenColour);
    }
    public static String getColourLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type in a first letter of a chosen color: yellow, blue, pink:");
            String chosenLetter = scanner.nextLine().trim().toUpperCase();
            switch (chosenLetter) {
                case "Y":
                    return "YELLOW";
                case "B":
                    return "BLUE";
                case "P":
                    return "PINK";

                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
