
import java.util.Scanner;

public class merge_two_arrays{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int arr1[]=new int[10];
        int arr2[]= new int[10];
        int arr3[]= new int[10];
        
        
        System.out.println("enter no. of elements to be added into the array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter 1st array element");
            arr1[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            System.out.println("enter 2nd array element");
            arr2[i]=sc.nextInt();
        }
        
        for(int i=n;i<2*n;i++){
            arr1[i]=arr2[i-n];
        }
        
        
        for(int i=0;i<2*n;i++){
            System.out.println(arr1[i]);
        }
    }
}

