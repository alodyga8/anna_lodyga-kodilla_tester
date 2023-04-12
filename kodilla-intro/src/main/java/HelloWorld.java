public class HelloWorld {
    public static void main(String[] args) {
        String greeting= "Hello World";
        String myName = "Anna";
        int myAge = 33;
        char mySurname = 'L';
        System.out.println("greeting: "+greeting);
        System.out.println("myName: "+myName);
        System.out.println("myAge: "+myAge);
        System.out.println("mySurname: "+mySurname);

        if (myAge < 10){
            System.out.println("You're a kid");
        } else if (myAge > 10 && myAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }
    }
}
