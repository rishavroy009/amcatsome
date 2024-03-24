import java.util.Arrays;

public class primetilln {
    public static void main(String[] args) {
        int n=50;
        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i<=Math.sqrt(n);i++){

            if(arr[i]==true){
                int p=i+i;
                while(p<n){
                    arr[p]=false;
                    p+=i;
                }
            }
        }
        for(int i=2;i<n;i++){
           
            if(arr[i]==true){
            if(i!=2)System.out.print(","+i);
            else System.out.print(i);
            }}
    }
}
