import java.util.Scanner;

public class weight_conversion_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight , new_weight;
        int choice;
        System.out.println("Weight conversion program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option : ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs :");
            weight = scanner.nextDouble();
            new_weight = weight * 0.453592;
            System.out.printf("Your weight in kgs : %.2f ",new_weight);
        }
        else if(choice == 2){
            System.out.print("Enter your weight in kgs :");
            weight = scanner.nextDouble();
            new_weight = weight * 2.20462;
            System.out.printf("Your weight in lbs : %.2f",new_weight);
        }
        
        else System.out.println("That's not a valid choice . Please enter any among 1 or 2");

        scanner.close();
    }
    
}
