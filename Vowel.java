

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U'){
                ans+=str.charAt(i);
            }
            i++;
        }
        System.out.println(ans);

    }
}
