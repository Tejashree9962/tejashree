import java.util.Scanner;
public class selection_sort {
    public static void main(String[] args) {
        System.out.println("enter how many elements you need to add into the list ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int smallest;
        int a;

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<n-1;j++){
           smallest=j;
            for(int i=j+1;i<n;i++){

                if(arr[smallest] > arr[i]){
                    smallest=i;
                    
                }

            }
            int temp=arr[smallest];
            arr[smallest]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
