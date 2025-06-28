public class array_2d_array {
    public static void main(String[] args) {
        /*2D array = an array where each element is anarray
         *             useful for storing a martix of data
         */
        String[] snacks = {"biscuit" , "cake" , "chocolate"};
        String[] veg = {"cucumber" , "potato" , "zinger"};
        String[] fruits = {"apple" , "mango" , "strawbery"};

        String[][] groceries = {snacks , veg , fruits};

        
        for(String[] foods : groceries){
            // System.out.println(grocery);  //if i do this it will just print the memory address
            for(String food : foods){
                System.out.print(food +" ");
            }
            System.out.println();
        
        }
    }
}
