
import java.util.Scanner;

public class factorial_function {
    static int factorial(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum=sum*i;
        }
        return(sum);
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the vaue of n");
        int n=sc.nextInt();
        int j=factorial(n);
        System.out.println(j);
        
    }
}

