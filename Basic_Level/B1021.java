package Basic_Level;
/*
1021. ��λ��ͳ�� (15) 
����һ��kλ����N = dk-1*10k-1 + �� + d1*101 + d0 (0<=di<=9, i=0,��,k-1, dk-1>0)�����д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺 
����N = 100311������2��0��3��1����1��3�� 
�����ʽ�� 
ÿ���������1��������������һ��������1000λ��������N�� 
�����ʽ�� 
��N��ÿһ�ֲ�ͬ�ĸ�λ���֣���D:M�ĸ�ʽ��һ���������λ����D������N�г��ֵĴ���M�� 
Ҫ��D����������� 
 */
import java.util.Scanner;
public class B1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] number = sc.next().toCharArray();
		int[] result = {0,0,0,0,0,0,0,0,0,0};
		for(char c:number) {
			int temp = c - '0';
			result[temp] = result[temp] + 1;
		}
		for(int i=0;i<10;i++) {
			if(result[i]!=0) {
				System.out.println(i + ":" + result[i]);
			}
		}
	}

}
