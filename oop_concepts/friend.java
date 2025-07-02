public class friend {
    String name;
    static int no_of_friends;

    friend(String name){
        this.name = name;
        no_of_friends++;
    }

    static void show_friends(){
        System.out.println("You have "+ no_of_friends +" friends");
    }
}
