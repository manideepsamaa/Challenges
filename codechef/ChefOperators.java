import java.io.InputStream;
import java.util.Scanner;

public class ChefOperators{

    public static void main(String[] args) {

        int T;
        Scanner sc = new Scanner(System.in) ;
        T= sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A>B){
                System.out.println(">");
            }
            else if (A<B){
                System.out.println("<");
            }
            else{
                System.out.println("=");
            }
            T=T-1;
        }
        

        
    }
}