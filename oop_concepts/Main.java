public class Main {
    public static void main(String[] args) {

        //Objects = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car(); //importing object from another file
        System.out.println(car.model);
        System.out.println(car.make);

        System.out.println(car.isRunning);
        car.start();  //importing method from another object
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
    }
}
