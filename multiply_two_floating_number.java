import java.util.Scanner;

public class multiply_two_floating_number {

    public static void main(String args[]){
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a floating numnber");
    float a = sc.nextFloat();
    System.out.println("enter another floating numnber");
    float b = sc.nextFloat();
    float c=a*b;
    System.out.printf("mutiplication of two floating number is %f",c);
        

    }
    
}
