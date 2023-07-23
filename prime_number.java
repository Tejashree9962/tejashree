import java.util.Scanner;
public class prime_number {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    
    System.out.println("enter the number to check whether the given number is a prime number or not ");
    int n =sc.nextInt();
    
    for(int j=1;j<=n;j++){
       int a=j;
       int m=a/2;
       int flag=1;
       int i;
       for( i=2; i<=m; i++){
           if (a%2==0){
               flag=0;
           }
       }
       if(flag==1){
           System.out.println(j+"it is a prime number");
        }
       else{
           continue;
           
       }
       
    }
    }
}

