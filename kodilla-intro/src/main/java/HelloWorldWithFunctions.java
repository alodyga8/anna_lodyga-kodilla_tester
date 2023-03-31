public class HelloWorldWithFunctions {
    public static void main(String[] args) {
        String greeting= "Hello World";
        System.out.println("greeting: " + greeting);

        String myPersonalData = getMyPersonalData();
        System.out.println(myPersonalData);
    }

    private static String getMyPersonalData() {
        String result = "";

        String myName = "Anna";
        int myAge = 33;
        char mySurname = 'L';

        result = result + "myName: " + myName + "\n";
        result = result + "myAge: " + myAge + "\n";
        result = result + "mySurname: " + mySurname + "\n";

        return result;
    }

    private static void displayMyPersonalData() {
        String result = "";

        String myName = "Anna";
        int myAge = 33;
        char mySurname = 'L';

        result = result + "myName: " + myName + "\n";
        result = result + "myAge: " + myAge + "\n";
        result = result + "mySurname: " + mySurname + "\n";

        System.out.println(result);
    }
}
