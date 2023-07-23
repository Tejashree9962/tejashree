import java.util.Scanner;
public class peterson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number ");
        int p= sc.nextInt();
        int sumf=0;
       
        int m=p;
        int q;
    while(p>0){
        q=p%10;
        
        int sum=1;
     for(int i=1;i<=q;i++){
       sum=sum*i;
       
     } 
     sumf=sumf+sum;
     
     
     p=p/10;

    
    }
    if(sumf==m){
        System.out.println("it is a peterson number ");
    }
    else{
        System.out.println("it is not a peterson number");
    }

}
}

