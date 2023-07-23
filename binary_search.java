
import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        System.out.println("enter how many elements ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the elements");
            arr[i]=sc.nextInt();}

        int first=0;
        int last=n-1;
        
        System.out.println("enter element to be searched ");
        int num=sc.nextInt();

        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<num){
                first= mid+1;

            }
            
            else if(arr[mid]==num){
                System.out.println("element found ");
                break;
            }
           else{
                last=mid-1;
            }
            mid=(first+last)/2;


        }
        if(first>last){
            System.out.println("element not found ");
        }

    }
    
}
