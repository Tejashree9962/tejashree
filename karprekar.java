import java.util.Scanner;

public class karprekar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number n");
        int n=sc.nextInt();
        int count=0;
        int r=0;
        int k=n*n;
        int t=k;
        int o=n;
        int p,q=0;
        while(k>0){
            k=k/10;
            count=count+1;
        }
    if(count%2==0){
       int  m=count/2;
        for(int i=0;i<m;i++){
            p=t%10;
            q=q*10+p;
            t=t/10;
        }
        
        while(q>0){
            p=q%10;
            r=r*10+p;
            q=q/10;
            
        }
        int fsum=r+t;
        
        if(fsum==o){
            System.out.println("it is a karprekar number ");
            
        }
        else{
            System.out.println("it is not a karprekar number");
        }
       
        
        
    }
}
}

