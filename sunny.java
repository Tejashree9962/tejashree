import java.util.Scanner;
public class sunny {
    public static void main(String[] args) {
        System.out.println("enter a number ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int f=n+1;
        System.out.println(f);
        int i=1;
        int flag=0;
        while(i>0){
            if(i*i==f){
                flag=1;
                System.out.println("it is a sunny number ");
                break;
            }
            
            i++;

        }
        if(flag==0){
            System.out.println("not a sunny number");
        }



    }
    
}
