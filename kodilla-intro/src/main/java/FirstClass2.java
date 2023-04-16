public class FirstClass2 {
    public static void main(String[] args) {

//        int weight = 800;
//        String name = "Volvo";
        Car car1 = new Car(800, "Volvo", 300);

        System.out.println(car1.weight);
        System.out.println(car1.name);
        System.out.println(car1.speed);

        car1.accelerate(30);
        System.out.println(car1.speed);

        car1.accelerate(-40);
        System.out.println(car1.speed);
    }
}

