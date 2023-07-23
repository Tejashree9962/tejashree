import java.util.Scanner;
public class atm {
    static void atm(){
        int initial_amount =100000;
        System.out.println("enter any number 1/2/3/4");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 to withdraw ");
        System.out.println("enter 2 to deposit");
        System.out.println("enter 3 to check balance ");
        System.out.println("enter 4 to exit ");

        int n= sc.nextInt();
        if(n==1){
            System.out.println("enter amount to withdraw from the bank");
            int x=sc.nextInt();
            initial_amount=initial_amount-x;
            System.out.println("amount withdrawed is "+x);
            atm();
        }
         else if(n==2){
            System.out.println("enter amount to deposit ");
            int y=sc.nextInt();
            initial_amount=initial_amount+y;
            System.out.println("amount deposited is "+y);
            atm();
         }
         else if(n==3){
            System.out.println("here is your balance ");
            System.out.println(initial_amount);
            atm();


         }
         else if(n==4){
            System.out.println("thank you ...visit our bank again");
            
         }
         else{
            System.out.println("number is incorrect..............enter the number correctly ");
            atm();
         }

         
        

       
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        atm();
    }
    
}
