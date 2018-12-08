package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1018 {
	private static final int[] winnum = new int[]{0,0,0,0,0,0,0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			String[] str = br.readLine().split(" ");
			judge(str[0],str[1]);
		}
		int Awin = winnum[1] + winnum[2] + winnum[3];
		int Bwin = winnum[4] + winnum[5] + winnum[6];
		int tie = winnum[0];
		System.out.println(Awin + " " + tie + " " + Bwin);
		System.out.println(Bwin + " " + tie + " " + Awin);
		System.out.print(Most(winnum[1],winnum[2],winnum[3]) + " " + Most(winnum[4],winnum[5],winnum[6]) );
	}
	public static void judge(String a,String b) {
		if(a.equals(b))
			winnum[0]++;
		if(a.equals("J")&&b.equals("B") || a.equals("C")&&b.equals("J") || a.equals("B")&&b.equals("C")) {
			if(a.equals("J")) winnum[1]++;
			if(a.equals("B")) winnum[2]++;
			if(a.equals("C")) winnum[3]++;
		}
		if(a.equals("B")&&b.equals("J") || a.equals("J")&&b.equals("C") || a.equals("C")&&b.equals("B")) {
			if(b.equals("J")) winnum[4]++;
			if(b.equals("B")) winnum[5]++;
			if(b.equals("C")) winnum[6]++;
		}
	}
	public static String Most(int a,int b,int c) {
		if( (a>b && a>c) || (a>b && b==c) ) return "J";
		if( (b>a && b>c) || (b>a && a==c) || (b>c && b==a) ||(b>a && b>c) || (a==b && b==c) ) return "B";
		if( (c>a && c>b) || (c>a && a==b) || (c>b && a==c) ) return "C";
		return null;
	}
}
