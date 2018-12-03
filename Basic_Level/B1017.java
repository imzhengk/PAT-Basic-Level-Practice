package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B1017 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		br.close();
		BigInteger bigOne = new BigInteger(str[0]);
		BigInteger bigTwo = new BigInteger(str[1]);
		BigInteger[] result = bigOne.divideAndRemainder(bigTwo);
		System.out.print(result[0] + " " + result[1]);
	}
}
