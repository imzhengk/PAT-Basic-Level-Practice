package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1070 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("\\s+");
		int[] leng = new int[N];
		for(int i=0;i<N;i++) {
			leng[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(leng);
		int num = leng[0];
		for(int i=1;i<N;i++) {
			num = (num + leng[i])/2;
		}
		System.out.println(num);
	}
}
