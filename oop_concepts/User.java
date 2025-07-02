public class User {
    
    String username;
    String email;
    int age;

    //making a constructor
    User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;

    }
    
    //methods having same name must have different paramiters
    User(String username,String email){
        this.username = username;
        this.email = email;
        this.age = 0;

    }
    User(String username,String email,int age){
        this.username = username;
        this.email = email;
        this.age = age;

    }
}
