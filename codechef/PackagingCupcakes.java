
import java.util.Scanner;

public class PackagingCupcakes{
 
public static void main(String[] args) {
    Scanner ab = new Scanner(System.in);
    int T = ab.nextInt();
	while(T>0)  {
        int N = ab.nextInt();
        System.out.println((N/2)+1);
        N = N-1;
    }
    
}


}