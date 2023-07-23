mport java.util.Scanner;
public class harshed_number{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter any number");
        int n=sc.nextInt();
        int t=n;
        int p,q=0;
        while(n>0){
            p=n%10;
            q=q+p;
            n=n/10;
        }
        if(t%q==0){
            System.out.print("it is a harshed number");
        }
        else{
            System.out.print("it is not aharshed number");
        }
    }
    
}


