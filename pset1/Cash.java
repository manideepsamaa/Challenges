import java.util.Scanner;
import java.io.InputStream;

public class Cash{
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float k=-1;
            while(k<0){
                k = sc.nextFloat();
            }
    
                float j =k*100;
                int c=0;
                
                while(j>0){
                    if(j>=25){
                        c=c+1;
                        j=j-25;
                    }
                    else if(j>=10){
                        c=c+1;
                        j=j-10;
                    }
                    else if (j>=5){
                        c=c+1;
                        j=j-5;
                    }
                    else if(j>=1){
                        c=c+1;
                        j=j-1;
                    }
                }
                System.out.println(c);}
            
        
}