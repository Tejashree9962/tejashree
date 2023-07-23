// bank problem using oops 
import java.util.Scanner;

class bank{

    int total;
    int amount;
    int sno;
    String name;
    

    public void insert(int costumer_id,String name,int amount){
        this.sno=costumer_id;
        this.name=name;
        this.amount=amount;


    }
    
    public void deposit(int amountf){
        System.out.println("amount deposited is "+amountf);
        amount=amount+amountf;
        System.out.println("balance is "+amount);
     }

     public void withdraw(int amountf){
        if(amountf>amount){
            System.out.println("out of balanace ");
            System.out.println("cannot be taken ");
        }
        else{
        System.out.println("amount withdrawed is "+amountf);
        amount=amount-amountf;
        System.out.println("balance is "+amount);
        }
    }

    public void balance(){
        System.out.println("amount remaining in "+ name+" account is "+amount);
    }

}


public class oops3 {
    public static void main(String[] args) {
        
    
        bank b = new bank();
        b.insert(1001,"tejashree",200000);
        b.deposit(10000);
        b.withdraw(500);
        b.balance();



    }
    
}
