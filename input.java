import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();  //.nextline() accepts string
        // we can use .next() but it won't read any space that's why we use nextline()

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //input integer value

        System.out.print("What is you cgpa: ");
        double cgpa = scanner.nextDouble(); //input double type data

        System.out.println("Hello " + name);
        System.out.println("You are "+ age +" years old" );
        System.out.println("Your cgpa is "+ cgpa);

        scanner.close();
    }
}
