public class swaptwo {
    public static void main(String[] args) {
        // int a=67;
        // int y=45;
        // a=a+y;
        // y=a-y;
        // a=a-y;
        // System.out.println(a+" "+y);
        //sum of dihitsof a number
        int y=8938383;
        int sum=0;
        while(y!=0){
            sum+=(y%10);
            y=y/10;
        }
        System.out.println(sum);
    }
}
