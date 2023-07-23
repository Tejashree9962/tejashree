
import java.util.Scanner;
public class neon_number{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number ");
        int n=sc.nextInt();
        int a=n*n;
        int b=n;
        int p,sum=0;
        while(a>0){
            p=a%10;
            sum=sum+p;
            a=a/10;
           
            
        }
        if(b==sum){
            System.out.println("it is a neon number");
        }
        else{
            System.out.println("it is not a neon number ");
        }
    }
}

