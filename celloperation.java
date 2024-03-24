public class celloperation {
    public static void main(String[] args) {
        int cell[]={1,0,0,0,0,1,0,0};
        int day=1;
        while(day>0){
            int temp[]=new int[8];
            temp[0]=0^temp[1];
            temp[7]=0^temp[6];
            for(int i=1;i<7;i++){
                temp[i]=cell[i-1]^cell[i+1];
            }
            for(int i=0;i<8;i++){
                cell[i]=temp[i];
            }
            day--;
        }
        for(int i=0;i<8;i++){
            System.out.print(cell[i]+" ");
        }
    }
}
