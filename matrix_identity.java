

import java.util.Arrays;
import java.util.Scanner;

public class matrix_identity {
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
        int count =0,count1=0;;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i][j]==0){
                        count1=count1+1;
                    }

                }
                if(i==j){
                    if (arr[i][j]==1){
                        count =count +1;
                    }

                }
            }
        }
        System.out.println(count);
        System.out.println(count1);

        if(count==m && count1==m*m-m){
        System.out.println("it is a identity matrix ");
        }
        else{
            System.out.println("not a identity matrix");
        }
        



        
    }
}

