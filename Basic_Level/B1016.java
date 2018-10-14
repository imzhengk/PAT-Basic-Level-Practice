package Basic_Level;
/*
1016 部分A+B （15 分）
正整数 A 的“D A（为 1 位整数）部分”定义为由 A 中所有 D A组成的新整数 P A。例如：给定 A=3862767，D A=6，则 A 的“6 部分”P A是 66，
因为 A 中有 2 个 6。现给定 A、D A、B、D B，请编写程序计算 P A+P  B。
输入格式：
输入在一行中依次给出 A、D A、B、D B，中间以空格分隔，其中 0<A,B<10 10。
输出格式：
在一行中输出 P A+P B的值。
 */
import java.util.Scanner;
public class B1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] D1 = sc.next().toCharArray();
		char Da = D1[0];
		char[] DA = new char[99];
		char[] B = sc.next().toCharArray();
		char[] D2 = sc.next().toCharArray();
		char Db = D2[0];
		char[] DB = new char[99];
		int flagA = 0;
		int flagB = 0;
		for(char c:A) {
			if(c == Da) {
				flagA = flagA + 1;
				DA[flagA] = Da;				
			}
		}
		if(flagA == 0) {
			flagA = 1;
			DA[1] = '0';
		}
		for(char c:B) {
			if(c == Db) {
				flagB = flagB + 1;
				DB[flagB] = Db;	
			}
		}
		if(flagB == 0) {
			flagB = 1;
			DB[1] = '0';
		}
		String sA = new String(DA,1,flagA);
		String sB = new String(DB,1,flagB);
		int sum = Integer.parseInt(sA) + Integer.parseInt(sB);
		System.out.print(sum);
	}

}
