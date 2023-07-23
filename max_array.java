import java.util.Scanner;
public class max_array {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter how many elements you need to add into the array");
        int n=sc.nextInt();
        
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.println("enter the elment ");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        
        for(int j=0;j<n;j++){
            if(max< arr[j]){
                max=arr[j];
            }
            
        }
        System.out.println(max);
    }
}
