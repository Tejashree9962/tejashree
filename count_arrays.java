

import java.util.Scanner;
import java.util.Arrays;

public class count_arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,0,1,3,5,7,9,4,6,8,0};
        System.out.println("enter an element to search for an element ");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (n==arr[i])
            count=count+1;
        }
        System.out.println(count +" times ");
        
    }
}

