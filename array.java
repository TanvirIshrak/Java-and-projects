import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple","papaya","banana"};

        //finding the length 
        int len_of_string = fruits.length;
        System.out.println(fruits[2]);
        System.out.println(len_of_string);

        // for(int i=0 ; i<len_of_string ; i++){
        //     System.out.println(fruits[i]);
        // }

        //to sort an array
        Arrays.sort(fruits);


        //to fill an array with a perticular word
        // Arrays.fill(fruits , "strawbery");

        
        for(String fruit : fruits){  //it's a normal loop iterated through all elements
            System.out.println(fruit);
        }

        

    }
}
