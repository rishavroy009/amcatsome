public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int k=0;
        for(int i=0;i<n;i++){
           
            if(i%2==0){
                k=k+i+1;
                for(int j=0;j<i+1;j++){
                    if(j!=i)System.out.print(k+"*");
                    else System.out.print(k);
                    k++;
                }
                System.out.println();
               
            }
            else{

                k=k+i;
                for(int j=0;j<i+1;j++){
                    if(j!=i)System.out.print(k+"*");
                    else System.out.print(k);
                    k--;
                }
                System.out.println();

            }
            
        }
    }
}
