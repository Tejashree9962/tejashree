import java.util.Scanner;

class calculator{
    public int add(int x,int y){
        int z=x+y;
        return z;

    }
}
public class classintro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n =sc.nextInt();
        System.out.println("enter another number");
        int m = sc.nextInt();

        calculator cal= new calculator();
        int output=cal.add(n,m);
        System.out.println("sum of two numbers is "+output);
        

    }
    
}
