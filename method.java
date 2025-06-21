public class method {
    //method = a block of reusable code that is executed when called ()
    // it is more like a function we learned in c
    public static void main(String[] args) {
        String name = "Ishrak";
        int age = 21;
        int num = 3;

        happybirthday(name, age);
        double result= square(num);
        System.out.println(result);
    }

    static void happybirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Happy birthday to you");
    }
    static double square(double num){
        return num*num;
    }


}
