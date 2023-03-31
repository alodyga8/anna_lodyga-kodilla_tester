public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 22;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        sumAndDisplay(firstNumber, secondNumber);

        firstNumber = 13;
        secondNumber = 30;

//        Previous version
//        int sum = sum(firstNumber, secondNumber);
//        System.out.println(sum);

        // could be replaced by executing sumAndDisplay function
        System.out.println(sum(firstNumber, secondNumber));
    }

    private static void sumAndDisplay(int a, int b) {
        System.out.println(sum(a, b));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}