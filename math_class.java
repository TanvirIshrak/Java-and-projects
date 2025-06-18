//    functions from Math class


public class math_class {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E); //E = euler's number

        //power
        double result = Math.pow(2,3); 
        System.out.println("The power result is "+result);

        //absolute value
        double absval = Math.abs(-5);
        System.out.println("The absolute value is " + absval);
        
        //suareroot
        double root = Math.sqrt(9);
        System.out.println("The root value is " + root);


        //Round , ceil , floor
        double roundx = Math.round(9.43); 
        System.out.println("The round value is " + roundx);
        /*
         round makes the nearest full number if it's below 9.5
         it will make that to 9
         and if it's more than 9.5 it will make 10
        */
        
        double ceilx = Math.ceil(9.13);
        System.out.println("The ceil value is " + ceilx);
        //ceil just captures the next full number doesn't matter what the double number is
        
        double floorx = Math.floor(9.93);
        System.out.println("The floor value is " + floorx);
        //floor just captures the previous full number doesn't matter what the double number is
    
        
        // Max min
        int maxx = Math.max(10, 20);
        int minx = Math.min(10, 20);

        System.out.println("The max value is " + maxx);
        System.out.println("The min value is " + minx);

        // doing the formula rootx = sqrt( a^2 + b^2)
        double a,b;
        a = Math.pow(3, 2);
        b = Math.pow(4,2);
        double rootx = Math.sqrt(a+b);
        System.out.println(rootx);
        
    
    
    }
}
