import java.util.Scanner;

public class array1{
    public static void main(String args[]){
        System.out.println("enter no. of elements needed to be added into the list");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[10];
        for(int i=0;i<n;i++){
            System.out.print("enter element ");
            int a=sc.nextInt();
            arr[i]=a;
            
        }
        
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            
        }
        
    }
}

