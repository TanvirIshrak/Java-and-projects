import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double num1,num2;
        String operator;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+ , - , * , / ,^):");
        operator = scanner.next();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case "+" -> System.out.print("The addition is = " + (num1+num2));
            case "-" -> System.out.print("The subtraction is = " + (num1-num2));
            case "*" -> System.out.print("The multiplication is = " + (num1*num2));
            case "/" -> {
                if(num2 == 0) System.out.println("You can't divide by 0");
                else System.out.print("The division is = " + (num1/num2));
            }
            case "^" -> System.out.print("The power is = " + Math.pow(num1,num2));
            
            default -> System.out.println("Invalid operator.");
        }
    }
}
