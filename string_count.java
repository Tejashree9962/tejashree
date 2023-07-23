import java.util.Scanner;
public class string_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string ");
        String n = sc.nextLine();
        int count=0;
        System.out.println("enter a character for which you need to count the characters ");
        char a=sc.next().charAt(0);
        for (int i=0;i<n.length();i++){
            if(n.charAt(i)==a){
                count=count+1;
            }
            
        }
        System.out.println("found "+count+"times ");






    }
    
}
