import java.util.Scanner;

public class string_modification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a string ");
        String s= sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        

        System.out.println("enter an element to get replaced with");
        char c= sc.next().charAt(0);
        for(int i=0 ;i<s.length();i++){
            if(c==s.charAt(i)){
                sb.("r","x");
            }



        }
        System.out.println(s);

    }
    
}
