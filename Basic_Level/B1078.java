package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1078 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ch = br.readLine();
        String str = br.readLine();
		if(ch.equals("C")) {
			Compression(str);
		}
		if(ch.equals("D")) {
			Decompression(str);
		}
	}
	static void Decompression(String str) {
		StringBuffer sb = new StringBuffer();
		char[] chs = str.toCharArray();
		int num = 0;
		for(int i=0;i<chs.length-1;i++) {
			if(Judge(chs[i]) && Judge(chs[i+1])) {
				num = num*10 + (chs[i] - '0');
			}
			if(Judge(chs[i]) && !Judge(chs[i+1])) {
				num = num*10 + (chs[i] - '0');
				for(int j=0;j<num-1;j++) {
					sb.append(chs[i+1]);
				}
				num = 0;
			}
			if(!Judge(chs[i])) {
				sb.append(chs[i]);
			}
		}
		sb.append(chs[chs.length-1]);
		System.out.println(sb.toString());
	}
	static void Compression(String str) {
		StringBuffer sb = new StringBuffer();
		char[] chs = str.toCharArray();
		int num = 1;
		for(int i=0;i<chs.length-1;i++) {
			if(chs[i]==chs[i+1]) {
				num++;
			}
			else {
				if(num==1) {
					sb.append(chs[i]);
				}
				else {
					sb.append(num);
					sb.append(chs[i]);
					num = 1;
				}
			}
		}
		if(num==1) {
			sb.append(chs[chs.length-1]);
		}
		else {
			sb.append(num);
			sb.append(chs[chs.length-1]);
		}
		System.out.println(sb.toString());
	}
	static boolean Judge(char ch) {
		if(ch>='0' && ch<='9')
			return true;
		else
			return false;
		
	}
}
