import java.util.Random;

public class RandomNumbers {
    private int min;
    private int max;

    public int getMin() {
        return this.min;
    }
    public int getMax() {

        return this.max;
    }

    public int getRandomNumber() {
        int maximumSum = 300;

        Random random = new Random();
        int sum = 0;
        int result = 0;

        this.min = 30;
        this.max = 0;

        while (sum < maximumSum) {
            int temp = random.nextInt(31);
            System.out.println("\nDrawn number: " + temp);
            sum = sum + temp;
            System.out.println("Sum: " + sum);
            result++;

            if (temp < this.min) {
                this.min = temp;
            }
            if (temp > this.max) {
                this.max = temp;
            }

            System.out.println("Min: " + this.min);
            System.out.println("Max: " + this.max);
        }
        return result;
    }
}



