

import java.util.Arrays;
import java.util.Scanner;

public class matrix_lower{
    public static void main(String[] args) {

        System.out.println("enter the no. of columns  ");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        System.out.println("enter the no. of rows ");
        int n = sc.nextInt();


        int arr[][]= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("enter element ");
                arr[i][j]=sc.nextInt();

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i>j){
                    arr[i][j]=0;
                }
                else{
                    continue ;
                }

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println("");
        }



        
    }
}