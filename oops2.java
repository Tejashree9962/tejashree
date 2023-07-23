// factorial using oops 
import java.util.Scanner ;

class fact{

    int z;
    int first=0;
    int second=1;
    int third;

    public void factf(int n){
        z=n;
        System.out.println(first);
        System.out.println(second);

        for(int i=2;i<z;i++){
            third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }
        


    }
}

public class oops2 {
    public static void main(String[] args) {
        System.out.println("enter the value of integer n ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        fact f1= new fact();
        f1.factf(n);

    }
    
}
