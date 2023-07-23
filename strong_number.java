
import java.util.Scanner;
public class strong_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check whether the given number is a strong number or not ");
        int a=sc.nextInt();
        int p,sum=0,q;
        q=a;
        while(a>0){
            p=a%10;
            sum=sum+p*p*p;
            a=a/10;   
        }
        
        if(sum==q){
            System.out.println("it is a strong number");
            
        }
        else{
            System.out.println("it is not a strong number");
        }
        
        
    }
}

