import java.util.Scanner;
public class emirp_prime {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int t=n;
        int p,sum=0;
        while(n>0){
            p=n%10;
            sum=sum*10+p;
            n=n/10; 
        }
        int flag=0,flag1=0;
        int m1=t/2;
        int m2=sum/2;
        for(int i=2;i<m1;i++){
            if(t%i==0){
                flag=1;
                break;
            }
        }

        
        for(int i=2;i<m2;i++){
            if(sum%i==0){
                flag1=1;
                break;
            }
            
        }

        if(flag==0 && flag1==0){
            System.out.println("it is a emirp number ");
        }
        else{
            System.out.println("it is not  a emirp number ");
        }

    }
    
}
