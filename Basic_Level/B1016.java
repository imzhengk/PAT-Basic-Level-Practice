package Basic_Level;
/*
1016 ����A+B ��15 �֣�
������ A �ġ�D A��Ϊ 1 λ���������֡�����Ϊ�� A ������ D A��ɵ������� P A�����磺���� A=3862767��D A=6���� A �ġ�6 ���֡�P A�� 66��
��Ϊ A ���� 2 �� 6���ָ��� A��D A��B��D B�����д������� P A+P  B��
�����ʽ��
������һ�������θ��� A��D A��B��D B���м��Կո�ָ������� 0<A,B<10 10��
�����ʽ��
��һ������� P A+P B��ֵ��
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
