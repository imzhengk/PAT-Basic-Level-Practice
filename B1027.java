/*
1027. ��ӡɳ©(20) 
����Ҫ����д������Ѹ����ķ��Ŵ�ӡ��ɳ©����״���������17����*����Ҫ�����и�ʽ��ӡ
*****
 ***
  *
 ***
*****
��ν��ɳ©��״������ָÿ��������������ţ����з������Ķ��룻�������з�������2���������ȴӴ�С˳��ݼ���1���ٴ�С����˳���������β��������ȡ�
��������N�����ţ���һ�����������һ��ɳ©��Ҫ���ӡ����ɳ©���õ������ܶ�ķ��š�
�����ʽ��
������һ�и���1��������N��<=1000����һ�����ţ��м��Կո�ָ���
�����ʽ��
���ȴ�ӡ���ɸ���������ɵ�����ɳ©��״�������һ�������ʣ��û�õ��ķ�������
 */
import java.util.Scanner;

public class B1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char ch = sc.next().charAt(0);
		sc.close();
		Rows(num,ch);
	}
	public static void Rows(int num,char ch) {
		int row = -1;
		while(num - row >= 0) {
			row = row + 2;
			num = num - row*2;
		}
		num++;
		int len =(row+1)/2;
		String[] str = new String[len];
		for(int i=0;i<len;i++) {
			char[] chs = new char[row];
			for(int j=0;j<(len+i);j++) {
				if(j < len-i-1) 
					chs[j] = ' ';
				else
					chs[j] = ch;
			}
			str[i] = new String(chs,0,len+i);
		}
		for(int i=(len-1);i>0;i--) 
			System.out.println(str[i]);
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println(num);
	}
}
