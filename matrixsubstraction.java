

import java.util.Scanner;
public class matrixsubstraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows in the matrix ");
        int m = sc .nextInt();
        System.out.println("enter  number of coloumns in the matrix");
        int n = sc .nextInt();

        System.out.println("enter the first matrix elements ");
        int arr1[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("enter the element ");
                    arr1[i][j]=sc.nextInt();
                }
                
        }
        
        int arr2[][]= new int[m][n];
        System.out.println("enter the 2 nd matrix element ");
        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("enter the element ");
                    arr2[i][j]=sc.nextInt();
                }
                
                
        }

        
        int arr3[][]= new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr3[i][j]= arr1[i][j] - arr2[i][j];
                System.out.print(arr3[i][j] + " ");}
                System.out.println("");
        }
        

        
      
    }
    }