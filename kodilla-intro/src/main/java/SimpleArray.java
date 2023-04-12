public class SimpleArray {
    public static void main(String[] args) {
        String [] cartoons= new String [5];
        cartoons[0]= "Tom and Jerry";
        cartoons[1]= "Sponge Bob";
        cartoons[2]= "Family Guy";
        cartoons[3]= "BoJack Horseman";
        cartoons[4]= "The Simpsons";

        System.out.println(cartoons[1]);

    int numberOfElements = cartoons.length;
        System.out.println("My array contains: " + cartoons.length + " elements");
}
}
