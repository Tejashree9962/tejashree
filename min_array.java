
import java.util.Scanner ;

public class min_array{
    public static void main(String args[]){
        System.out.println("enter the no of elements to be added into thre array ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int min=arr[0];
        for(int j=0;j<n;j++){
            if(min>arr[j]){
                min=arr[j];
            }
            
        }
        System.out.println(min);
    }
}

