public class constructor {
    public static void main(String[] args) {
        
        //Constructor = A special method to initialize objects
        //              You can pass arguments to a constructor
        //              and set up initial values

        Student student1 = new Student("Ishrak",22,3.4);
        Student student2 = new Student("Anik",21,3.8);
    
    
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);


        student1.study();
        student2.study();
    }
}
