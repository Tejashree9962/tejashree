// single inheritance 
class inherit1{
    int a1;
    int b1;
    void add (int a,int b){
        int a1= a;
        int b1=b; 
        System.out.println("sum of two numbers is "+(a1+b1));

    }

}
class inherit2 extends inherit1{
    void multi(int a,int b){
        a1=a;
        b1=b;
        
        System.out.println("multiplication of two number is "+a1*b1);


    }


}


public class inheritance {
    public static void main(String[] args) {
        inherit2 s= new inherit2();
        s.add(10,20);
        s.multi(10, 20);




        
    }
    
}
