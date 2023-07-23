
import java.util.Scanner;
import java.util.Arrays;
public class string_anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String s1= sc.nextLine();

        System.out.println("enter another string ");
        String s2=sc.nextLine();

        String d=s1.toLowerCase();
        String d1=s2.toLowerCase();

        char[] arr= d.toCharArray();
        char[] arr1=d1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr1[i]){
                count =count+1;
            }
        }

        if(count ==arr1.length){
            System.out.println("it is a anagram ");

        }
        else{
            System.out.println("it is not a anagram ");
        }


        
    }
}
    