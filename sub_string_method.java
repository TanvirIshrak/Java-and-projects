/* .substrig() = a method used to extract a portion of a string
 *              string.substring(start , end)
 */

public class sub_string_method {
    public static void main(String[] args) {
        
        String email = "ishrak23@gmail.com";
        String username = email.substring(0, 8);
        //if i print the rest from the beginning then i don't need the end index
        String domain = email.substring(9);

        System.out.println(username);
        System.out.println(domain);



        //to make it more flexible
        //for those who have different size of strings
         String email1 = "ishrakpstu23@gmail.com";
        String username1 = email1.substring(0, email1.indexOf("@"));
        String domain1 = email1.substring(email1.indexOf("@") + 1 );
                                //that +1 means to indicate everything after the @ sign
        System.out.println("username : " +username1);
        System.out.println("domain : " +domain1);
    }
    
}
