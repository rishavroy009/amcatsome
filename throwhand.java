public class throwhand {
    public static void main(String[] args){
        throwstu myc=new throwstu();
        //since it is a checked exception,it detects exception at compile time so you 
        //need to wrap the code in try-catch block or need to make the class throws Exception
        try{
            myc.setStudent(-133);
        }
        catch(Exception e){
System.out.println(e.getMessage());
        }
        System.out.println(myc.student);
    }
}
