public class Car {
    
    String make = "ford";
    String model = "Mastang";
    int year = 2025;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stoped the engine.");
    }
}
