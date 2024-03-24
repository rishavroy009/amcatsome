public class pattern2 {
    
    public static void main(String[] args) {
        int s=3;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(s);
            }
            s++;
            System.out.println();
        }
        s--;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(s);
            }
            s--;
            System.out.println();
        }
    }
}
