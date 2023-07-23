import java.util.Scanner;
public class buzz {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int t=n;
        if(n%10==7 || t%7==0){
            System.out.println("it is a buzz number ");
        }
        else{
            System.out.println("it is not a buzzz number ");
        }

    }
    
}
