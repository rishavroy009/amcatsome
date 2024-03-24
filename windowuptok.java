import java.util.Scanner;

public class windowuptok {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]={2,4,6,3,5,9,4,3,5};
        int i=0;
        int count=0;
        int size=0;
        while(i<arr.length){
            if(arr[i]<=k){
                size++;
            }
            else{
                size=0;
            }
            if(size==n){
                count++;
                size--;
            }
            i++;
        }
        System.out.println(count);
    }
}
