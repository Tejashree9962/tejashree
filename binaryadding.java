
import java.util.Scanner;

public class binaryadding {
    static String Bin_add(String x, String y)
    {int n = Integer.parseInt(x, 2);
    int m = Integer.parseInt(y, 2);
    int sum = n+m;
    String finalbin = Integer.toBinaryString(sum);
    return finalbin;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        String x=sc.nextLine();
        System.out.println("enter another number ");
        String y=sc.nextLine();
        String k=Bin_add(x, y);
        System.out.println(k);
       
    }
    
}
