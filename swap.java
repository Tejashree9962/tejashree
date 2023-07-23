import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
            int a, b, temp;
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter value of a:");
    a = sc.nextInt ();
    System.out.println ("enter value of b:");
    b = sc.nextInt ();
    System.out.printf("number before swapping are a=%d and b=%d \n",a,b);
        
    temp = b;
    b = a;
    a = temp;

    System.out.printf("number after swapping are a=%d and b=%d", a, b);

    }
}
    