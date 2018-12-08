package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1084 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s+");
		int N = Integer.parseInt(str[1]);
		String num = str[0];
		for(int i=0;i<N-1;i++) {
			StringBuffer sb = new StringBuffer();
			int len = num.length();
			char[] chs = num.toCharArray();
			int cnt = 1;
			for(int j=0;j<len-1;j++) {
				if(chs[j]==chs[j+1]) {
					cnt++;
				}
				if(chs[j]!=chs[j+1]) {
					sb.append(chs[j]);
					sb.append(cnt);
					cnt = 1;
				}
			}
			sb.append(chs[len-1]);
			sb.append(cnt);
			num = sb.toString();
		}
		System.out.println(num);
	}
}
