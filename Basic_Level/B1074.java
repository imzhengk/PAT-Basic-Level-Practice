package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 *1.最后输出用BigInteger；
 *2.进位要输出；
 *3.数字0不能当被除数  
 */

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
			int tt = tmp + t;
			if(tt==0) {
				ans[i] = 0;
				t = 0;
			}
			else {
				ans[i] = tt % r;
				t = tt / r;	
			}
		}
		StringBuffer bs = new StringBuffer();
		bs.append(t);
		for(int i : ans) {
			bs.append(i);
		}
		BigInteger bi = new BigInteger(bs.toString());
		System.out.println(bi);
	}
}
