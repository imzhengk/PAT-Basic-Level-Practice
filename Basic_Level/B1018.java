package Basic_Level;
/*
1018 锤子剪刀布 （20 分）
大家应该都会玩“锤子剪刀布”的游戏：
现给出两人的交锋记录，请统计双方的胜、平、负次数，并且给出双方分别出什么手势的胜算最大。
输入格式：
输入第1行给出正整数N（<=105），即双方交锋的次数。随后N行，每行给出一次交锋的信息，即甲、乙双方同时给出的的手势。
C代表“锤子”、J代表“剪刀”、B代表“布”，第1个字母代表甲方，第2个代表乙方，中间有1个空格。
输出格式:
输出第1、2行分别给出甲、乙的胜、平、负次数，数字间以1个空格分隔。第3行给出两个字母，分别代表甲、乙获胜次数最多的手势，
中间有1个空格。如果解不唯一，则输出按字母序最小的解。
 */
//运行超时
import java.util.Scanner;

public class B1018 {
	private static final int[] winnum = new int[]{0,0,0,0,0,0,0};
	//1 甲J，2 甲B，3 甲C，4 乙J，5 乙B，6 乙C
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String a = sc.next();
			String b = sc.next();
			judge(a,b);
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
			winnum[0] = winnum[0] + 1;
		if(a.equals("J")&&b.equals("B") || a.equals("C")&&b.equals("J") || a.equals("B")&&b.equals("C")) {
			if(a.equals("J")) winnum[1] =winnum[1] + 1;
			if(a.equals("B")) winnum[2] =winnum[2] + 1;
			if(a.equals("C")) winnum[3] =winnum[3] + 1;
		}
		if(a.equals("B")&&b.equals("J") || a.equals("J")&&b.equals("C") || a.equals("C")&&b.equals("B")) {
			if(b.equals("J")) winnum[4] =winnum[4] + 1;
			if(b.equals("B")) winnum[5] =winnum[5] + 1;
			if(b.equals("C")) winnum[6] =winnum[6] + 1;
		}
	}
	public static String Most(int a,int b,int c) {
		if( (a>b && a>c) || (a>b && b==c) ) return "J";
		if( (b>a && b>c) || (b>a && a==c) || (b>c && b==a) ||(b>a && b>c) || (a==b && b==c) ) return "B";
		if( (c>a && c>b) || (c>a && a==b) || (c>b && a==c) ) return "C";
		return null;
	}

}
