
// basic oops program 
class student {
    int roll_no;
    String name;

     student(int n,String namef)
    {   roll_no= n;
        name=namef;
       

    }

    public void view(){

        System.out.println(roll_no+" "+name );

    }


}
public class oops1 {
    public static void main(String[] args) {
        int a=1;
        String name="teja";
        student s1= new student(a, name);
        student s2= new student(2, "sas");
        
        s1.view();
        s2.view();
        


        


        
    }    
}
