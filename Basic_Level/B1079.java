package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1079 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer str = new StringBuffer(br.readLine());
		BigInteger N = new BigInteger(str.toString());
		BigInteger M = new BigInteger(str.reverse().toString());
		boolean flag = false;
		for(int i=0;i<10;i++) {
			if(N.equals(M)) {
				System.out.println(N + " is a palindromic number.");
				flag = true;
				break;
			}
			BigInteger C = N.add(M);
			System.out.println(N + " + " + M + " = " + C);		
			str = new StringBuffer(C.toString());
			N = new BigInteger(str.toString());
			M = new BigInteger(str.reverse().toString());
		}
		if(!flag) {
			System.out.println("Not found in 10 iterations.");
		}
	}
}
