import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=n*n;
        int t=s,sum=0,p;
        while(s>0){
            p=s%10;
            sum=sum+p;
            s=s/10;
        }
        if (sum==n){
            System.out.println(" it is a neon number ");
        }
        else{
            System.out.println(" it is not a neon number");
        }


    }
    
}
