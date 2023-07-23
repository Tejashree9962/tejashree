import java.util.Scanner;


class A{
    int x;
    int y;

    void add(int a,int b){
        x=a;
        y=b;
        System.out.println("addition of two numberv is "+(a+b));

    }

     void sub(int a,int b){
        x=a;
        y=b;
        
        System.out.println("subtraction of two numberv is "+(a-b));

    }

}
class B extends A{
   
     void mul(int a,int b){
         x=a;
         y=b;
        System.out.println("multiplication of two number is "+(x*y));

    }

}

class c extends B{
 void div(int a,int b){
        x=a;
        y=b;
        System.out.println("division of two number is "+x/y);

    }
}

public class inheritance_multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter one number ");
        int a=sc.nextInt();

        System.out.println("enter anotehr number ");
        int b=sc.nextInt();

        System.out.println("enter any one operation");
        System.out.println("enter 1 to add ");
        System.out.println("enter 2 to substractr");
        System.out.println("enter 3 to multiply");
        System.out.println("enter 4 to divide ");
        

        int n=sc.nextInt();
        c c1 =new c();


        if(n==1){
            c1.add(a,b);}

        else if(n==2){
            c1.sub(a,b);}
        
        else if(n==3){
            c1.mul(a,b);}
        
        else if(n==4){
            c1.div(a,b);}
        
        else{
            System.out.println("enter the correct number ");
        }


       


    }
    
}
