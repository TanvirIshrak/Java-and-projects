public class Inheritence_and_organism_animal_dog_cat {
    public static void main(String[] args) {
        //Inheritance = One class inherits the attributes and methods
                        // from another class
                        // Child <- Parent <-Grandparent


        Animal_Dog dog = new Animal_Dog();
        Animal_Cat cat = new Animal_Cat();

        System.out.println(dog.lives);
        System.out.println(cat.isAlive);

        dog.speak();
        cat.speak();
    }
}
