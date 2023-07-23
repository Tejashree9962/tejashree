

import java.util.Arrays;
import java.util.Scanner;

public class matrixeven_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the colomns of the matrix ");
        int m = sc.nextInt();
        System.out.println("enter the rows of the matrix ");
        int n = sc.nextInt();

        int arr1[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter the element ");
                arr1[i][j]=sc.nextInt();
            }
        }
int ecount =0;
int ocount=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i][j]%2==0){
                    ecount =ecount+1;

                }
                else{
                    ocount=ocount+1;
                }
            }
        }

        System.out.println("total even numbers are "+ecount );
        System.out.println("total odd numbers are "+ocount);
    

        
      
    }
    }

    
