public class Student {
    String name ;
    int age;
    double gpa;
    boolean isEnrolled;

    //making a constructor named Student
    //when we import the object we actually call this constructor
    Student(String name,int age,double gpa){
        //this* refers to the object we corrently work with 
        //ex. student1 , student2
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void study(){
        System.out.println(this.name+" is studying.");
    }
}
