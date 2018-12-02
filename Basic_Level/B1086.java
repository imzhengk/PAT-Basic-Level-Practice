package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		BigInteger a = new BigInteger(str[0]);
		BigInteger b = new BigInteger(str[1]);
		char[] c = a.multiply(b).toString().toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}
}
