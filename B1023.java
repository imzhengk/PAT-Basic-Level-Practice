/*
1023. �����С�� (20) 
��������0-9�����ɸ��������������˳��������Щ���֣�������ȫ��ʹ�á�Ŀ����ʹ�����õ�����������С��ע��0��������λ����
���磺��������0������1������5��һ��8�����ǵõ�����С��������10015558���ָ������֣����д��������ܹ���ɵ���С������ 
�����ʽ�� 
ÿ���������1������������ÿ������������һ���и���10���Ǹ�������˳���ʾ����ӵ 
������0������1����������9�ĸ�������������һ���ո�ָ���10�����ֵ��ܸ���������50��������ӵ��1����0�����֡� 
�����ʽ�� 
��һ��������ܹ���ɵ���С������ 
 */
import java.util.Scanner;

public class B1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		boolean first = false;
		int temp = 0;
		for(int i=0;i<10;i++) {
			num[i] = sc.nextInt();
			if(num[i]!=0 && i>0 && !first) {
				temp = i;
				num[i]--;
				first = true;
			}
		}
		System.out.print(temp);
		for(int i=0;i<10;i++) {
			for(int j=num[i];j>0;j--)
				System.out.print(i);
		}
	}
}
