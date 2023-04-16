public class Car {
    public int weight;
    public String name;
    public int speed;
    public int maxSpeed;

    public Car(int weight, String name, int maxSpeed) {
        this.weight = weight;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void accelerate(int kilometersPerHour) {
        if (kilometersPerHour > 0) {
            speed = speed + kilometersPerHour;
        }

        if (speed > maxSpeed) {
            speed = maxSpeed;
        }

//        if (speed < 0) {
//            speed = 0;
//        }
    }
    public void slowDown () {
        if (speed < 0) {
            speed = 0;
        }
    }
}
