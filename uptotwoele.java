public class uptotwoele{
    public static void main(String[] args) {
        int arr[]={2,2,2,2,3,3,3,3,3,5,5,5,8,9};
        int n=arr.length;
        int i=0;
        int j=0;
        int pointer=0;
        int count=0;
        while(i<n&&j<n){
            
            if(arr[j]==arr[i]){
                count++;
                if(count<=2){
                    arr[pointer]=arr[j];
                    pointer++;
                }
                j++;
            }
            else{
                i=j;
                count=0;
               
            }
           
        }
        for(int p=0;p<pointer;p++){
            System.out.print(arr[p]+" ");
        }
    }
}