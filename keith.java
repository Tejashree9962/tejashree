import java.util.Scanner;
public class keith {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int arr[]= new int[1000];
        int sum=0,p,count=0,sumf=0;
        while(n>0){
            p=n%10;
            sum=sum*10+p;
            n=n/10;
            count=count+1;}

        for(int i=0 ;i<count ;i++){
            p=sum%10;
            arr[i]=p;
            sum=sum/10;}
        int j=1;
        
        while(j<4){
            System.out.println(j);
            j++;

        }

    }
    
}
