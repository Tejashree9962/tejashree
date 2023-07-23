class A{
    
    void display(int x, int y){
        System.out.println("your name is ");
    }

    
}

class B extends A{
    void name(){
        System.out.println("my name is teja ");
    }

}

class C extends A{
    void name1(){
        System.out.println("my name is devi");
    }


}

public class inheritance_hirarchiel {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        C c1= new C();
        B c2= new B();
        c1.display(10,20);
        c1.name1();
        c2.display( 20,30);
        c2.name();

        



    }
    
}
