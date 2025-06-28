public class variable_arguments {
    public static void main(String[] args) {
        /*varargs =  allows a metos to accept a varuing of arguments
         *          makes methods more flexible,no need for overloaded methods
         *          java will pack the arguments into an array
         *          ... (ellipsis)
         */
         

        System.out.println(add(1,2,3));

    }

    static int add(int... numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
     }
    
}
