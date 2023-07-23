

import java.util.Scanner ;
public class leap_year{
    public static void main(String args[]){
        int n;
        int flag=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number ");
        n=sc.nextInt();
        if(n%4==0){
            flag=0;
            if(n%100==0){
                if(n%400==0){
                    flag=0;
                }
                else{
                    flag=1;
                }
            }
        }
        else{
            flag=1;
        }
        
        if(flag==1){
            System.out.println("not a leap year");
        }
        else{
            System.out.println("it is a leap year");
        }
    }
}

