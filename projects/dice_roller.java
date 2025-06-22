import java.util.Scanner;
import java.util.Random;

public class dice_roller {
    public static void main(String[] args) {
        //JAVA DICE ROLLER PROGRAM

        //DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num_of_dice , total=0;

         //GET # OF DICE FROM THE USER
        System.out.print("Enter the number of dice to roll: ");
        num_of_dice=scanner.nextInt();

        //CHECK IF # OF DICE > 0
        if(num_of_dice > 0){
            //ROLL ALL THE DICE
           for(int i=0 ; i<num_of_dice ; i++){
               int roll = random.nextInt(1,7);
               print_die(roll);
               System.out.println("You rolled " +roll);
               total +=roll;
           }
           //GET THE TOTAL
           System.out.println("total " +total);
        }
        else {
            System.out.println("Number of dice must be grater than 0");
        }

       
        
        
        
        //DISPLAY ASCII OF DICE

        scanner.close();
    }

    static void print_die(int roll){
        //here we make multiline string 
        //anything under """ is multiline string
        //win + r -- charmap
        String dice1 = """
                 -------
                |       |
                |   ●   |    
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |    
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |    
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |    
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |    
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |    
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalied roll");
        }
    }
}
