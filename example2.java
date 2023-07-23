import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of columns to create the sqauare");
        int m=sc.nextInt();
        int n=m;
        for(int i=0;i<n;i++){
            if(i==0){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
            }
            else if (i==n-1){
                for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
            }
            
            else{
                for(int p=0;p<n;p++){
                    if(p==0){
                        System.out.print("*");
                        
                    }
                    else if (p!=n-1){
                        System.out.print(" ");
                        
                    }
                    else{
                        System.out.println("*");
                    }
                    
                    
                }
            }

        }


    }
    
}
