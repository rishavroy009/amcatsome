public class expdemo {
    public static void main(String[] args) {
        try{
            int arr[]=new int[13];
        System.out.println(arr[2]);
        System.exit(0);
        //unchecked exception,(compilation possible without handling exception)
    }//checked exception (we need to write try & catch block or use throw keyword)like filenotfound,
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    finally{
System.out.println("Inside finally block");
    }//if you use a resource,this block is used for ensuring that those resources got colse like database,files or scanner.
    //trywithresouce
    }
}
