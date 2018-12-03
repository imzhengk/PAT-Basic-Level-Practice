package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1008 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		String[] fig = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String[] num = new String[N];
		for(int i=0;i<N;i++) {
			num[(i+M)%N] = fig[i];
		}
		System.out.print(num[0]);
		for(int i=1;i<N;i++) {
			System.out.print(" " + num[i]);
		}
	}
}
