import java.util.Scanner;

public class bubble_sort {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter how many elements needed to be added into the list");
        int n=sc.nextInt();

        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter element");
            arr[i]=sc.nextInt();
        }
        
        for(int j=0;j<n;j++){
            for(int k=0;k<n-j-1;k++){
                if (arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

    for(int j=0;j<n;j++){
        System.out.println(arr[j]);
    }
    
}
}
