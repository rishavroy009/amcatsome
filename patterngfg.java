import java.util.ArrayList;
import java.util.List;

public class patterngfg {
    public static void main(String[] args) {
        List<String> ans=new ArrayList<>();
        int n=3;
       
        int p=1;
        for(int i=0;i<n;i++){
            String str="";
           
            for(int s=0;s<2*i;s++){
                str+=" ";
            }
            for(int j=0;j<n-i;j++){
                str+=(char)(p+48);
                str+='*';
                p++;
            }
            ans.add(str);
        }
        for(String c:ans){
            System.out.println(c);
        }
    }
}
