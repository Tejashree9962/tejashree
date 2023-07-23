import java.util.Scanner;
public class techno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int t=n,sum=0,p,m,sum1=0,q,z;
        int y=n;
        int count=0;
        while(n>0){
            n=n/10;
            count=count+1;

        }
        if(count%2==0){
            m=count/2;
            
            for(int i=0;i<m;i++){
                p=t%10;
                sum=sum*10+p;
                t=t/10;
                
            }
            
         
        }
        z=sum;
       
       
         while(sum>0){
            q=sum%10;
            sum1=sum1*10+q;
            sum=sum/10;

        }
        
        
        int sumf=sum1+t;
        System.out.println(sumf);
        if(y== (sumf*sumf)){
            System.out.println("it is a tech number ");
        }
        else{
            System.out.println("it is not a tech number ");
        }
        

        
    }
    
}
