public class Array_of_objects_and_Car2 {
    public static void main(String[] args) {
        // Car2 car1 = new Car2("Mastag","Red");
        // Car2 car2 = new Car2("BMW","white");
        // Car2 car3 = new Car2("Mcloren","black");

        // Car2[] cars = {car1,car2,car3};


        //gonna pass values to array directly by calling the constructor 
        //these are called annonymous objects as these has no name
        Car2[] cars = {new Car2("Mastag","Red"),
                        new Car2("BMW","white"),
                        new Car2("Mcloren","black")};

        // for(int i=0 ; i<cars.length ; i++){
        //     cars[i].drive();
        // }


        //gonna use enhenced for loop
        for(Car2 car:cars){
            car.drive();
        }
    }
}
