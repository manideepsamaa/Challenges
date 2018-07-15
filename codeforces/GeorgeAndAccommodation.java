import java.util.Scanner;

public class GeorgeAndAccommodation{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0 ; i<n ; i++){
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if((b-a)>=2){
                c=c+1;
            }

        }
        System.out.println(c);
        sc.close();
    }
}