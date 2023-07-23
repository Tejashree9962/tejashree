
import java.util.Scanner;
import java.util.Arrays;

public class reverse_array{
    public static void main(String args[]){
    System.out.println("enter number of elements to be added into the list ");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr2[]= new int[n]; 
    int arr[]= new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enter the element");
        arr[i]=sc.nextInt();
    }
    
    Arrays.sort(arr);
    for(int j=0;j<n;j++){
        arr2[n-1-j]=arr[j];
    }
    
    for(int j=0;j<n;j++){
        System.out.println(arr2[j]);
    }
    
    
    }
}


