import java.net.SocketPermission;
import java.util.Scanner;
public class evenorodd {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number to check whether the givenm number is a odd or even number");
        int n= sc.nextInt();

        if(n%2==0){
            System.out.println("it is a even number");
        }
        else{
            System.out.println("it is a odd number ");
        }
         }
    
}
