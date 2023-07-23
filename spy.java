import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int p=0,sum1=0,sum2=1;
        while(n>0){
            p=n%10;
            sum1=sum1+p;
            n=n/10;

        }
        
        while(t>0){
            p=t%10;
            sum2=sum2*p;
            t=t/10;

        }
        if(sum1==sum2){
            System.out.println("it is a neon number");
        }
        else{
            System.out.println("it is not a neon number ");
        }


    }
}
