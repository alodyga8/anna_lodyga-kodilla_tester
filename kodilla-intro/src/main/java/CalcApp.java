public class CalcApp {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator();
        double area = calculator1.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
