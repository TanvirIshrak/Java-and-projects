import java.util.Random;

public class random_number {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(1,100);  //number between 1 to 100
        double number1 = random.nextDouble(1.0,100.0);  //number between 1 to 100
        boolean isHead = random.nextBoolean();
        
        System.out.println(number);
        System.out.println(number1);
        
        if(isHead){
            System.out.println("Heads");
        }
        else System.out.println("tails");
    }
}
