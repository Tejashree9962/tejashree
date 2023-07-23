import java.util.Scanner;
public class emirp {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int t=n;
        int count=0;
        int sum=0,p;
        while(n>0){
            count=count+1;
            n=n/10;
        }

        while(t>0){
            p=t%10;
            sum=sum+p;
            t=t/10;
        }
        if(count==sum){
            System.out.println(" it is a autobiographical number");
        }
        else{
            System.out.println("it is not a autobiographical number ");
        }


    }
    
}
