import java.util.Scanner;
public class string1_program {
    public static void main(String[] args) {
        // problem 1 
        // to convert a string to lower case 
        System.out.println("enter any string ");
        Scanner sc =new Scanner(System.in);
        String n =sc.nextLine();
        
        //problem 2 
        // to replave the dpace with the underscore
        System.out.println(n.toLowerCase());
        System.out.println(n.replace(" ","_"));

        //problem 3 
        // to check for double and triple spaces
        System.out.println(n.indexOf("  "));
        System.out.println(n.indexOf("   "));
        
        
    }
}
