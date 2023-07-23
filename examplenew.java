import java.util.Scanner;
public class examplenew {
    public static void main(String[] args) {
        System.out.println("how many elements needed to be added into the list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int arr2[]= new int[n];

        for(int i =0;i<n;i++){
            System.out.println("enter the element ");
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            arr2[j]=arr[j];
        }
        
        for(int k=0;k<n;k++){
            System.out.println(arr2[k]);
        }



    }
    }
}