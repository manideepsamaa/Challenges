import java.io.*;
import java.util.*;

public class Day6{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int o=0 ; o<i;o++){ 
                if(o>0){
                    System.out.println("");
                }
                String j = sc.next();
                int k = j.length();
                for(int m =0;m<k;m++){
                    if(m%2==0){
                        char a = j.charAt(m);
                        System.out.print(a);
                    }    
                }
                System.out.print(" ");
                for(int n =0;n<k;n++){
                    if(n%2!=0){
                        System.out.print(j.charAt(n));
                    }    
                }
            
          
            
            
        }
       
           sc.close();         
    }

}