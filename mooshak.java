public class mooshak {
    public static void main(String[] args) {
        int grid[][]={{0,0,0},{9,1,1},{0,1,1}};
        int n=grid.length;
        int mat[][]=new int[grid.length][grid.length];
        if(calc(0,0,mat,grid,n)){
            System.out.println(1);
        }
        else{
        System.out.println(0);
        }
    }
    public static boolean calc(int i,int j,int mat[][],int grid[][],int n){
        if(i<0||j<0||i>=n||j>=n||grid[i][j]==0||mat[i][j]==1){
            return false;
        }
        if(grid[i][j]==9)return true;
        mat[i][j]=1;
        boolean op1=calc(i,j-1,mat,grid,n);
        boolean op2=calc(i-1,j,mat,grid,n);
        boolean op3=calc(i+1,j,mat,grid,n);
        boolean op4=calc(i,j+1,mat,grid,n);
mat[i][j]=0;
return op1||op2||op3||op4;
    }
}
