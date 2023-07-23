import java.util.Scanner;
public class insertion_sort {
    public static void main(String[] args) {
        System.out.println("enter the number of elements ;");
        Scanner sc= new  Scanner(System.in);
        int n= sc.nextInt();

        int arr[]= new int[n];
        
        for (int i=0;i<n;i++){
            System.out.println("enter the elements");
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            for (int i=0;i<n-j-1;i++){
               if( arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
               }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }



    }
    
}
