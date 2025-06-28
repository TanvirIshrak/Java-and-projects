import java.util.Scanner;

public class quiz_game {
    public static void main(String[] args) {
        
        //Question array[]
        String[] questions={"What is the main fuction of a router?",
                            "Which part of the computer is considered the brain?",
                            "What year was facebook launched?",
                            "Who is known as the father of computer?",
                            "What was the first programming language?"};
        //option array[][]
        String[][] options= {{"1. Storing files","2. Encripting data","3. Directing internet trafic","4. Managing passwords"},
                            {"1. CPU","2. Hard drive","3. RAM","4. GPU"},
                            {"1. 2000","2. 2004","3. 2006","4. 2008"},
                            {"1. Steve jobs","2. Bill gates","3. Alan turing","4. Charls babez"},
                            {"1. COBOL","2. C","3. Fortran","4. Assembly"},
                            };
        // DECLEAR VARIABLES
        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);
        

        //WELCOME MSG
        System.out.println("*************************");
        System.out.println("Welcome to JAVA QUIZ Game");
        System.out.println("*************************");
        
        //QUESTION(loop)
        for(int i=0 ; i<questions.length ; i++){
            System.out.println(questions[i]);

            //  options
            for(String option : options[i]){
                System.out.println(option);
            }

            //  get guess from user
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  check our guess
            if(guess == answers[i]){
                System.out.println("#######");
                System.out.println("CORRECT");
                System.out.println("#######");
                score++;
            }
            else{
                System.out.println("#####");
                System.out.println("WORNG");
                System.out.println("#####");
            }
        }
       
        //DISPLAY FINAL SCORE
        System.out.println("Your final score is :"+score+" out of "+questions.length);
        
        scanner.close();
    }
}
