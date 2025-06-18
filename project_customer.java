import java.util.Scanner;
public class project_customer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy? : ");
        String item = scanner.nextLine();

        System.out.print("What is the price for each? :");
        double price = scanner.nextDouble();

        System.out.print("How many would you like? :");
        int pieces= scanner.nextInt();

        System.err.println("You have bought " + pieces + " " +item +"/s");
        System.out.println("Your total is $"+ pieces*price);
        scanner.close();
    }
}
