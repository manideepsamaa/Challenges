import java.util.ArrayList;
import java.util.Scanner;

public class Reverse{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0;i<t;i++){

            int d = sc.nextInt();
            ArrayList <String> l = new ArrayList<>();

            for(int j=0; j< d;j++){
		
                l.add(sc.nextLine());

            }

            System.out.println("Begin "+ (l.get(d-1).substring(l.get(d-1).indexOf(" "))));
            for(int p=d-1;p>0;p--){
                if(l.get(p).startsWith("Right")){
                    System.out.println("Left"+ (l.get(p-1).substring(l.get(p-1).indexOf(" "))));

                }
                else{
                    System.out.println("Right"+ (l.get(p-1).substring(l.get(p-1).indexOf(" "))));
                }
            }


        }
	sc.close();
    
    }
}
