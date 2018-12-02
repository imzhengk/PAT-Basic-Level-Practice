package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1060 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().trim().split(" ");
		int i = 0;
		for(i=N;i>0;i--) {
			int cur = 0;
			for(int j=0;j<N;j++) {
				if(Integer.parseInt(s[j])>i)
					cur++;
			}
			if(cur >= i) {
				break;
			}
		}
		System.out.println(i);
	}
}
