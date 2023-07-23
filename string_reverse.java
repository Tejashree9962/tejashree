import java.util.Scanner;
public class string_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string ");
        String n = sc.nextLine();
        String reverse="";
        int l=n.length();
        for(int i=l-1;i>=0;i--){
           reverse = reverse +n.charAt(i);
        }

        System.out.println("reversed string is "+reverse);



    }
    
}
