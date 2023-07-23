import java.util.Scanner;

public class sum_of_arrays
{
  public static void main (String args[])
  { int[] arr1=new int[10];
   int[] arr2=new int[10];
   int[] arr3=new int[10];
    System.out.println ("enter the number of elements added into the list");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
   
    
    for(int i=0;i<n;i++){
        System.out.print("enter element for array1");
        arr1[i]=sc.nextInt();
    }
    
    for(int j=0;j<n;j++){
        System.out.print("enter element for array2");
        arr2[j]=sc.nextInt();
    }
    
    for(int i=0;i<n;i++){
        int sum=arr1[i]+arr2[i];
        arr3[i]=sum;
    }
    
    for(int k=0;k<n;k++){
        
        System.out.println(arr3[k]);
    }
        

  }
}

