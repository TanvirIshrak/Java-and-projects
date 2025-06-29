import java.util.Random;
import java.util.Scanner;

public class Slot_machine {
    public static void main(String[] args) {
        
        //DECLEAR VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String play_again;

        //DISPLAY WELCOME MESSAGE
        System.out.println("**************************");
        System.out.println("  Welcome to JAVA Slots  ");
        System.out.println("   Symbols: A 0 7 X Z");
        System.out.println("**************************");
        //PLAY IF BALANCE > 0 
        while(balance > 0){
            //ENTER BET AMOUNT
            System.out.println("Your balance: $"+balance);
            System.out.print("Place bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine(); //to get rid of the input buffer

            //  VARIFY IF BET > BALANCE
            if(bet>balance){ 
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            }
            //  VARIFY IF BET > 0
            else if(bet <=0){
                 System.out.println("Bet must be greater than 0");
                continue;
            }
            //  SUBTRACT BET FROM BALANCE
            else{
                 balance-=bet;
            }

            //SPIN ROW
            //PRINT ROW
            System.out.println("Sinning...");
            row = spin_row();
            print_row(row);

            //GET PAYOUT
            payout = get_payout(row,bet);
            if(payout>0){
                System.out.println("You won $"+payout);
                balance+=payout;
            }
            else{
                System.out.println("Sorry you lost this round!");
            }

            //ASK TO PLAY AGAIN
            System.out.print("DO you want to play again? (y/n): ");
            play_again = scanner.nextLine().toLowerCase();
            if(!play_again.equals("y")){
                break;
            }

        }  

        System.out.print("GAME OVER! Your final balance is: $"+balance);
        
        
        //DISPLAY EXIT MESSAGE
        scanner.close();
    }

    static String[] spin_row(){
        String[] symbols = {"A" ,"0" ,"7" ,"X", "Z"};
        String[] row = new String[3];
        Random random = new Random();

        
        for(int i=0 ;i<3 ;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void print_row(String[] row){
        System.out.println("***********");
        System.out.println(" "+String.join(" | ",row)); //joining row elements with a virtical bar
        System.out.println("***********");
    }

    static int get_payout(String[] row,int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "A" -> bet*3;
                case "0" -> bet*4;
                case "7" -> bet*20;
                case "X" -> bet*5;
                case "Z" -> bet*10;
                default -> 0;
            };
        }
        return 0;
    }
}
