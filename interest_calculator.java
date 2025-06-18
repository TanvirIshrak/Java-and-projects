import java.util.Scanner;

public class interest_calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double principal,rate,amount;
        int timesCompounded,years;

        System.out.println("Enter the principal val: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the rate val(in %): ");
        rate = scanner.nextDouble() /100 ;

        System.out.println("Enter the # of time compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

         System.out.println("The amount after " + years + " is: $ " +amount);

        scanner.close();
    }
}
