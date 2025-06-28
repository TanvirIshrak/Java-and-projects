import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
    
        //DECLEAR VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"rock","paper","scissors"};
        String playerChoice;
        String Computer_Choice;
        String play_again = "yes";
    do{
        //GET CHOICE FROM THE USER
        System.out.print("Enter your move (rock,paper,scissors):");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
            !playerChoice.equals("paper") &&
            !playerChoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }
        //GET RANDOM CHOICE FROM THE COMPUTER
        Computer_Choice = choices[random.nextInt(3)];
        System.out.println("Computer choice: "+Computer_Choice);

        //CHECK WIN CONDITIONS
        if(playerChoice.equals(Computer_Choice)){
            System.out.println("It's a tie!");
        }
        else if((playerChoice.equals("rock") && Computer_Choice.equals("scissors")) ||
                (playerChoice.equals("paper") && Computer_Choice.equals("rock")) ||
                (playerChoice.equals("scissors") && Computer_Choice.equals("paper"))){
            System.out.println("You win!");
        }
        else System.out.println("You lose!");


        //ASK TO PLAY AGAIN
        System.out.print("Play again (yes/no):");
        play_again = scanner.nextLine().toLowerCase();
    }while(play_again.equals("yes"));
        
        //GOOD BYE MESSAGE
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
