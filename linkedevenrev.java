import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedevenrev {

   static Node head=null;
   public static void insert(int data){
    if(head==null){
        head=new Node(data);
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=new Node(data);
    
   } 
   public static void revert(){
    Node temp=head;
    Node pre=null;
    while(temp!=null){
       
        if(temp.data%2==0){
            Node curr=temp;
            int k=0;
            Node track=null;
            while(curr.data%2==0){
                k++;
                track=curr;
                curr=curr.next;
            }
            track.next=null;
           Node chan=temp;
           Node aage=null;
            for(int i=0;i<k-1;i++){
                Node te=chan.next;
                chan.next=aage;
                aage=chan;
                chan=te;
            }
            if(pre==null)head=aage;
            else{
            pre.next=aage;}
            if(aage==null){
                pre.next=curr;
            }
            else{
                while(aage.next!=null){
                    aage=aage.next;
                }
                aage.next=curr;
                pre=aage; 
            }
          
            temp=curr;
            
        }
        pre=temp;
        temp=temp.next;
    }
   }
public static void printr(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int p=sc.nextInt();
           insert(p);
        } 
        revert();
        printr();
    }
}
