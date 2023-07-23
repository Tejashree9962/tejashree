import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        int n = sc.nextInt();
        int p;
        int m=n;
        int t=n*n;
        int count=0;
        int sum=0,sum1=0;
        while(n>0){
            n=n/10;
            count=count+1;
        }
       
        for(int i=0;i<count;i++){
            p=t%10;
            sum=sum*10+p;
            t=t/10;

        }
        for(int i=0;i<count;i++){
            p=sum%10;
            sum1=sum1*10+p;
            sum=sum/10;

        }
        if(sum1==m){
            System.out.println("it is a automorphioc number ");

        }
        else{
            System.out.println("it is not a automorphoic number ");
        }
        

    }
    
}
