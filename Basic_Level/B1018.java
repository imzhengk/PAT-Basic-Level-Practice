package Basic_Level;
/*
1018 ���Ӽ����� ��20 �֣�
���Ӧ�ö����桰���Ӽ�����������Ϸ��
�ָ������˵Ľ����¼����ͳ��˫����ʤ��ƽ�������������Ҹ���˫���ֱ��ʲô���Ƶ�ʤ�����
�����ʽ��
�����1�и���������N��<=105������˫������Ĵ��������N�У�ÿ�и���һ�ν������Ϣ�����ס���˫��ͬʱ�����ĵ����ơ�
C�������ӡ���J������������B������������1����ĸ����׷�����2�������ҷ����м���1���ո�
�����ʽ:
�����1��2�зֱ�����ס��ҵ�ʤ��ƽ�������������ּ���1���ո�ָ�����3�и���������ĸ���ֱ����ס��һ�ʤ�����������ƣ�
�м���1���ո�����ⲻΨһ�����������ĸ����С�Ľ⡣
 */
//���г�ʱ
import java.util.Scanner;

public class B1018 {
	private static final int[] winnum = new int[]{0,0,0,0,0,0,0};
	//1 ��J��2 ��B��3 ��C��4 ��J��5 ��B��6 ��C
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
