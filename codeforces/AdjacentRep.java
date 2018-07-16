import java.util.Scanner;

public class AdjacentRep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [] a = new int[n];
        for(int i = 0 ; i<n ;i++){
            a[i] = sc.nextInt();
           
        }
        int g = 0;
        for(int i =  0 ; i<n ; i++){
            g = a[i];
            int h=0;
            while(h<2){

                if((g%2) == 0){
                    for (int j = 0 ; j<n ; j++){
                            if(a[j] == g){
                                a[j] = (a[j] - 1);
                                
                            }
                    }
                }
                else{
                    for (int k = 0 ; k<n ; k++){
                        if(a[k] == g){
                            a[k] = (a[k] + 1);
                            
                        }
                    }
                }
                h=h+1;
                g=g+1;
            }
            
        }
            
            
           
        
        
        for(int k = 0 ; k<n ; k++){
            System.out.print(a[k]+ " ");
        }
        sc.close();
    }   
    
}