import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        System.out.println("enter how many elements to be inserted into the list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
int l;int d;int index;
        int arr[]= new int[100];
        for (int i=0;i<n;i++){
            System.out.println("enter the elements ");
            arr[i]=sc.nextInt();

        }

        System.out.println("enter 1 to see the stack ");
        System.out.println("enter 2 to push the element into the list");
        System.out.println("enter 3 to delete the element from the list ");
        int x=sc.nextInt();
        if (x==1){
        for(int j=0;j<n;j++){
            System.out.println(arr[n-1-j]);}
        }
        
        if(x==2){
        System.out.println("enter a element to append into the list");
        System.out.println(n);
        arr[n]=sc.nextInt();
    }

        if(x==3){
            System.out.println("enter the element to delete from the list ");
            d=sc.nextInt();
            for(int i =0;i<arr.length;i++){
                if(d==arr[i]){
                    index=i+1;
                }
            }
            
        }
        else{

            System.out.println("entered number is invalid");
        }


    }
    
}
