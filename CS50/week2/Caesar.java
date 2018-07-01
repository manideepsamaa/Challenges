import java.util.Scanner;


public class Caesar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextLine();
        sc.nextLine();
        String st = sc.nextLine();
        
        for(int i=0;i<st.length();i++){
            char a = st.charAt(i);
            
            if(a>='a' && a<='z'){
                char d = (char) ((a + key -97)%26 +97);
                System.out.print(d);
            }

            else if (a>='A'&& a<='Z'){

                char d = (char) ((a + key -65)%26 +65);
                System.out.print(d);
            }
    

            else{
                System.out.print(a);
            }
        }
        System.out.println();

        
    }
}