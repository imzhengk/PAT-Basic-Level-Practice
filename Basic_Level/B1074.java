package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//答案错误
public class B1074 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] biao = br.readLine().toCharArray();
		String a = br.readLine();
		String b = br.readLine();
		int[] ans = new int[biao.length];
		String temp = "";
		for(int i=0;i<biao.length-a.length();i++) {
			temp += "0";
		}
		char[] numa = (temp + a).toCharArray();
		temp = "";
		for(int i=0;i<biao.length-b.length();i++) {
			temp += "0";
		}
		char[] numb = (temp + b).toCharArray();
		int t = 0;
		for(int i=biao.length-1;i>=0;i--) {
			int tmp = (int)(numa[i] - '0') + (int)(numb[i] - '0');
			int r = (int)(biao[i] - '0');
			if(r==0) r = 10;
			if(tmp==0) {
				ans[i] = 0;
				t = 0;
			}
			else {
				int tt = tmp + t;
				ans[i] = tt % r;
				t = tt / r;	
			}
		}
		StringBuffer bs = new StringBuffer();
		for(int i : ans) {
			bs.append(i);
		}
		System.out.println(Integer.parseInt(bs.toString()));
	}
}
