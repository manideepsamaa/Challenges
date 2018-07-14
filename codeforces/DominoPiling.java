import java.util.Scanner;

public class DominoPiling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k  = (m*n)/2;
        System.out.println(k);
        sc.close();
    }
}