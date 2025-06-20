public class thread_class {
    public static void main(String[] args) throws InterruptedException {
        int start =10;
        for(int i=start ; i>0 ; i--){
            System.out.println(i);
            Thread.sleep(1000);
            /*this method interapts the fluent output
             * rather wait for 1000 milisec to execute the next output
             */
        }
        System.out.println("Happy New Year");
    }
}
