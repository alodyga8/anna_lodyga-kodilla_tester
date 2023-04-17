public class Person {
    public static String name;
    public static double age;
    public static double height;
    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void showPersonInfo() {
        if (name != null) {
        if (age > 30 && height > 160) {
            System.out.println("This person is older than 30 and taller than 160cm");
        } else {
            System.out.println("This person is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
}
