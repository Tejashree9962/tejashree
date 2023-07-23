

class adder{
    
    public  int add(int a ,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public  double add(double a,int b){
        return a+b;
    }
    public String add(String a){
        return "teja";
    }

    
}
public class overloading1 {
    public static void main(String[] args) {
        adder a = new adder();
        System.out.println("hello");
        System.out.println(a.add(1,2));
        System.out.println(a.add(1,2,4));
        System.out.println(a.add(1.41,3));
        System.out.println(a.add("s"));
        
    }
    
}
