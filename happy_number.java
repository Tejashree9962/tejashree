
import java.util.Scanner;

public class happy_number{
    
    static int happy(int n){
        int p,q=0;
        while(n>0){
            p=n%10;
            q=q+p*p;
            n=n/10;
            }
            System.out.print(q);
            return (q);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.print("enter a number to find whether the given number is a happy number or not ");
        int n=sc.nextInt();
        while(n!=1 && n!=4){
            n=happy(n);
            System.out.print("\n");
            
        }
        
        if(n==1){
            System.out.print("it is a happy number ");
        }
        if(n==4){
            System.out.println("it is not a happy number");
        }
        
        
        
    }
}


