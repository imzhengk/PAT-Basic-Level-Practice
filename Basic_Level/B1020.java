package Basic_Level;
/*
1020 �±� ��25 �֣�
�±����й���������ѽ�ʱ�Ե�һ�ִ�ͳʳƷ����ͬ��������಻ͬ��ζ���±���
�ָ������������±��Ŀ���������ۼۡ��Լ��г�����������������������Ի�õ���������Ƕ��١�
����ʱ����ȡ��һ���ֿ�档���������� 3 ���±����������ֱ�Ϊ 18��15��10 ��֣����ۼ۷ֱ�Ϊ 75��72��45 ��Ԫ��
����г������������ֻ�� 20 ��֣���ô��������������Ӧ��������ȫ�� 15 ��ֵ� 2 ���±����Լ� 5 ��ֵ� 3 ���±������ 72 + 45/2 = 94.5����Ԫ����
�����ʽ��
ÿ���������һ������������
ÿ�����������ȸ���һ�������� 1000 �������� N ��ʾ�±������������Լ������� 500�������Ϊ��λ���������� D ��ʾ�г������������
���һ�и��� N ��������ʾÿ���±��Ŀ�����������Ϊ��λ�������һ�и��� N ��������ʾÿ���±������ۼۣ�����ԪΪ��λ����
���ּ��Կո�ָ���
�����ʽ��
��ÿ�������������һ�������������棬����ԪΪ��λ����ȷ��С����� 2 λ��
 */
//���г�ʱ
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int demand = sc.nextInt();
		HashMap map = new HashMap();
		int[][] total = new int[2][n];
		double[] unit = new double[n];
		for(int i=0;i<n;i++) {
			total[0][i] = sc.nextInt();//����
		}
		for(int i=0;i<n;i++) {
			total[1][i] = sc.nextInt();//�ܼ�
		}
		for(int i=0;i<n;i++) {
			unit[i] = (double)total[1][i]/(double)total[0][i];//����
			map.put(unit[i], i);
		}
		Arrays.sort(unit);
		int[] number = new int[n];
		int[] price = new int[n];
		for(int i=0;i<n;i++) {
			int temp = (int) map.get(unit[i]);
			number[i] = total[0][temp];
			price[i] = total[1][temp];
		}
		int sum = 0;
		double prices = 0;
		for(int i=n-1;i>=0;i--) {
			if(sum + number[i] < demand) {
				sum = sum + number[i];
				prices = prices + price[i];
			}
			else if(sum + number[i] >= demand) {
				int temp = demand - sum;
				prices = prices + unit[i]*(double)temp;
				break;
			}
		}
		System.out.printf("%.2f",prices);
	}
}
