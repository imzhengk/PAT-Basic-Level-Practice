/*
1001 �����˲�������(3n+1)���� ��15 �֣�
���κ�һ�������� n���������ż������ô��������һ�룻���������������ô�� (3n+1) ����һ�롣��������ȥ�����һ���õ� n=1��
���ǽ������Ŀ����֤�������Ȳ��룬���ǶԸ�������һ������ 1000 �������� n���򵥵���һ�£���Ҫ���ٲ��������£����ܵõ� n=1��
�����ʽ��ÿ������������� 1 ������������������������ n ��ֵ��
�����ʽ������� n ���㵽 1 ��Ҫ�Ĳ�����
����������3
���������5
*/
import java.util.Scanner;
public class B1001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int step = 0;
		while(num != 1) {
			if(num % 2 == 0) {
				step = step + 1;
				num = num/2;
			}
			else {
				step = step + 1;
				num = (3*num + 1)/2;
			}
		}
		System.out.println(step);
	}

}
