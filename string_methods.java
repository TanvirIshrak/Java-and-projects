public class string_methods {
    public static void main(String[] args) {
        String name = "Tanvir Ishrak";
        // String name = "PASSWORD";

        //to calculate the lenght of given string
        int length = name.length();
        System.out.println("Length is " + length);

        //to find out any character just giving index val
        char letter = name.charAt(4);
        System.out.println(letter);

        //to find out any index giving a character
        int index = name.indexOf("k");
        System.out.println("The index is "+index);

        //to find out last character if that exists multiple time
        int lastIndex =  name.lastIndexOf("a");
        System.out.println(lastIndex);

        //to make the string upper and lowecase
        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // System.out.println(name);

        //to tring all blank spaces before or after of a string
        String x = "         hell    ";
        x = x.trim();
        System.out.println(x);

        //to replace any charater to another
        x = x.replace("l", "p");
        System.out.println(x);

        //to check my string is empty or not 
        // x = x.isEmpty()
        //it will return val in boolean form

        //to ensure anything that contains that string
        if(x.contains("o")){
            System.out.println("that string contains an o");
        }
        else System.out.println("It doesn't contains o");
        

        //to compare two strings
        if(name.equalsIgnoreCase("password")){  //that ignorecase is for ignoring case sensitivity like it maybe password/PASSWORD/Password ...
            System.out.println("Your name can't be password"); 
        }
        else System.out.println("Hello "+name );
    }
}
