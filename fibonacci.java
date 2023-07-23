
import java.util.Scanner;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        System.out.println(first);
        System.out.println(second);
        
        for(int i=2;i<n;i++){
            third=first+second ;
            first=second;
            second=third;
            System.out.println(third);
            
            
        }
    }
}
