import java.util.Scanner;
public class counting_of_digits{
    public static void main(String args[]){
        int n;
        System.out.print("enter number ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        
        while(n>0){
            n=n/10;
            count=count+1;
            
        }
        System.out.println("total digits "+count);
    }
}




