import java.util.Scanner;

public class magic_number{
    public static void main(String args[]){
        System.out.printf("enter a number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p,q=0;
        int t=n;
        int q1=0,q2;
        while(n>0){
            p=n%10;
            q=q+p;
            n=n/10;
            
        }
        q2=q;
     
        
        while(q>0){
            p=q%10;
            q1=q1*10+p;
            q=q/10;
        }
        
        int ans=q1*q2;
        
       
        if(ans==t){
            System.out.print("it is a magic number");
        }
        else{
            System.out.print("it is not a magic number");
        }
        
        
        
    }
}

