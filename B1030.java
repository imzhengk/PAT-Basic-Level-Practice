/*
1030. ��������(25) 
����һ�����������У���������p������������е����ֵ��M����Сֵ��m�����M <= m * p���������������������С� 
���ڸ�������p��һЩ���������������ѡ�񾡿��ܶ��������һ���������С� 
�����ʽ�� 
�����һ�и�������������N��p������N��<= 10^5����������������ĸ�����p��<= 10^9���Ǹ����Ĳ������ڶ��и���N����������ÿ����������10^9�� 
�����ʽ�� 
��һ�������������ѡ����ٸ����������������һ���������С�
*/
//������ȷ
import java.util.Arrays;
import java.util.Scanner;

public class B1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int p = sc.nextInt();
		int[] list = new int[num];
		for(int i=0;i<num;i++) {
				list[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(list);
		int max = 1;
		for(int i=num-1;i>1;i--) {
			for(int j=i-max+1;j>0;j--) {
				if(list[i] <= list[j]*p && list[i] > list[j-1]*p)
					break;
				max++;
			}
		}
		System.out.println(max);
	}
}
