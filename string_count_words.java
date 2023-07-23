import java.util.Scanner;
public class string_count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string ");
        String n = sc.nextLine();
        int a = n.length();
        char a1=" ".charAt(0);
        
        int count =0;
        for(int i=0;i<a;i++){
           
            if (n.charAt(i)== a1){
                System.out.println(n.charAt(i));
                count =count+1;
                
            }
            
        }
        int countfinal= count+1;
        System.out.println(" total number of words found are "+countfinal+"times");

    }
    
}
