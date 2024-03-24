public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1;i<n;i++){
            
            for(int j=0;j<i;j++){
                if(j!=i-1){
                System.out.print(k+"*");}
                else System.out.print(k);
                k++;
            }
            System.out.println();
        }
        k=k-n+1;
        int p=n;
        for(int i=1;i<n;i++){
         
            int c=k;
            for(int j=0;j<n-i;j++){
                if(j==n-i-1)System.out.print(c);
                else System.out.print(c+"*");
                c++;
            }
         k=k-(n-i-1);
            System.out.println();
        }
    }
}
