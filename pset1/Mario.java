import java.util.Scanner;

public class Mario{
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Height: ");
            int T = sc.nextInt();
            for(int l=1;l<=T;l++){
                int i ,j;
                for(i=1;i<=T-l;i++){
                    System.out.print(" ");
                }
                for(j=1;j<l+2;j++){
                    System.out.print("#");
                }
                System.out.println();
            }

                
                    
           
            
            
            sc.close();

        }

}