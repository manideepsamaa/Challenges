
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for(int j = 0 ; j<n ; j++) {
			int d = 0;
			for (int k = 0 ; k<3; k++) {
				int h = sc.nextInt();
				if(h==1) {
					d=d+1;
				}
				
			}
			if(d>=2) {
				count = count + 1;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
