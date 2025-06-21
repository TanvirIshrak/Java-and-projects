import java.util.Scanner;

public class Banking_program {

    static Scanner scanner = new Scanner(System.in);
    //Java Banking program 
    public static void main(String[] args) {
        double balance=10.43;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            //DISPLAY MENU
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Diposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");
            

            //GET AND PROCESS USERS CHOICE
            System.out.print("Enter yout choice (1-4): ");
            choice = scanner.nextInt();
            switch(choice){
                case 1 ->  showbalance(balance);
                case 2 ->  balance = balance + diposit();
                case 3 ->  balance = balance - Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalied choice");
            }

        }
        System.out.println("Thank you ! Have a good day.");
        scanner.close();
        
    }

    static void showbalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }
    static double diposit(){

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount=scanner.nextDouble();

        if(amount < 0) System.out.println("Diposite can't be negative");
        else return amount;
        return 0;
    }

    static double Withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawed: ");
        amount=scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insuficient balance");
            return 0;
        }
        else if(amount < 0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

}
