import java.util.Scanner;

public class array2{
    public static void main(String arg[]){
        System.out.println("enter how many elements you need to actually add into the list");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element");
            int z=sc.nextInt();
            arr[i]=z;
            
        }
        int sum=0;
        for(int j=0;j<n;j++){
            sum=sum+arr[j];
        }
        System.out.println("sum of list is "+sum);
        System.out.printf("average of number is "+sum/n);
    }
}
