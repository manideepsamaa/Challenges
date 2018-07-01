import java.util.Scanner;
import java.util.*;
public class Infinity {

    public static void main(String [] args)
    { 
        String[] arr = {"purple","green","blue","orange","red",
        "yellow"};
    
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
         String[] b = new String[n];
         int[] c = new int[n];
        for(int i=0;i<n;i++){
            b[i] = sc.next();
       
        }
        sc.close();
       
        int k=0;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<6;j++){
                if(arr[j].equals(b[i])){
                    c[k]=j;
                    
                    k=k+1;
                    
                }
            }
        }

        
        int i = 0 ;
        Arrays.sort(c);
        System.out.println(6-n);

        if(n==0){
            System.out.println("Time");
            System.out.println("Mind");
            System.out.println("Soul");
            System.out.println("Power");
            System.out.println("Reality");
            System.out.println("Space");

        }

        for(i=0;i<6;i++){
            int s=0;
            for(int d=0;d<n;d++){
                if((c[d] != i )){
                    s=s+1;
                    if(s==n){
                        switch(arr[i]){
                            
                            case "purple" :
                                System.out.println("Power");
                                break;
                            
                            case "green" :
                                System.out.println("Time");
                                break;
    
                            case "blue" :
                                System.out.println("Space");
                                break;
    
                            case "orange" :
                                System.out.println("Soul");
                                break;
    
                            case "red" :
                                System.out.println("Reality");
                                break;
    
                            case "yellow" :
                                System.out.println("Mind");
                                break;
                            
                        }}
                    
                    
                    
                
            }
        }
            }
            
                
            
                

        

        

    
}}

