package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1088 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int M = Integer.parseInt(str[0]);
		int X = Integer.parseInt(str[1]);
		int Y = Integer.parseInt(str[2]);
		int A = 0,B = 0;
		double C = 0;
		boolean flag = false;
		for(int i=99;i>9;i--) {
			A = i;
			B = A%10*10 + A/10;
			if((double)Math.abs(A-B)/(double)X == (double)B/(double)Y) {
				C = (double)B/(double)Y;
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.print(A);
	        if(M==A)
	            System.out.printf(" Ping");
	        else if(M<A)
	            System.out.printf(" Cong");
	        else
	            System.out.printf(" Gai");
	        if(M==B)
	            System.out.printf(" Ping");
	        else if(M<B)
	            System.out.printf(" Cong");
	        else
	            System.out.printf(" Gai");
	        if(M==C)
	            System.out.printf(" Ping");
	        else if(M<C)
	            System.out.printf(" Cong");
	        else
	            System.out.printf(" Gai");
		}
		else {
			System.out.println("No Solution");
		}
	}
}
