
import java.util.Scanner;
public class reverse_a_number {
    public static void main(String args[]){
    int n,p,q=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number n");
    
    n=sc.nextInt();
    System.out.println("the number before reversed is "+n);
    while(n>0){
        p=n%10;
        q=q*10+p;
        n=n/10;
    }
    System.out.println("the number after reversed is "+q);
       
    
    }
}

