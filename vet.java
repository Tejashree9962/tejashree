import java.util.Scanner;
import java.util.Arrays;
public class vet{
    public static void main(String[] args) {
        System.out.println("enter how many arrays you need to add into the list");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the element ");
            arr[i]=sc.nextInt();
        }
       
        int temp;
        for(int i=0;i<n;i++){
         
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}