public class Static_and_friend {
    public static void main(String[] args) {
        // Static = Makes a variable or methos belong to the class
        //         rather than to any specific object
        //         Commonly used for utility methods or shared resources.
    
    
        friend friend1 = new friend("Azad");
        friend friend2 = new friend("Azad");
        friend friend3 = new friend("Azad");
        friend friend4 = new friend("Azad");
    
        System.out.println(friend.no_of_friends);
        friend.show_friends();
    
    }
}
