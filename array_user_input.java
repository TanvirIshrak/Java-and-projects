import java.util.Scanner;

public class array_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //for entering user input to an array
        //we need to clearify the size of that array
        // String[] foods = new String[3] ;

        System.out.print("How much foods you wanna order ? : ");
        
        //lets input the dinamic array size
        int size = scanner.nextInt();
        scanner.nextLine();  //it's to overcome the input buffer
       
        String[] foods = new String[size]; 
        
        for(int i=0 ; i< foods.length ; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
