package Basic_Level;
/*
1019. ���ֺڶ� (20) 
������һ����λ���ֲ���ȫ��ͬ��4λ����������������Ȱ�4�����ְ��ǵ������� 
�ٰ��ǵݼ�����Ȼ���õ�1�����ּ���2�����֣����õ�һ���µ����֡�һֱ�ظ� 
�����������Ǻܿ��ͣ���С����ֺڶ���֮�Ƶ�6174��������������Ҳ��Kaprekar������ 
���磬���Ǵ�6767��ʼ�����õ� 
7766 �C 6677 = 1089 
9810 �C 0189 = 9621 
9621 �C 1269 = 8352 
8532 �C 2358 = 6174 
7641 �C 1467 = 6174 
�� �� 
�ָ�������4λ�����������д������ʾ����ڶ��Ĺ��̡� 
�����ʽ�� 
�������һ��(0, 10000)�����ڵ�������N�� 
�����ʽ�� 
���N��4λ����ȫ��ȣ�����һ���������N �C N = 0000�������򽫼����ÿһ���� 
һ���������ֱ��6174��Ϊ����֣������ʽ��������ע��ÿ�����ְ�4λ����ʽ����� 
 */
import java.util.Arrays;
import java.util.Scanner;

public class B1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(true) {
			int max = Max(number);
			int min = Min(number);
			number = max - min;
			if (number == 0) {
                System.out.printf("%04d - %04d = %04d\n", max, min, number);
                break;
            }
            if (number == 6174) {
                System.out.printf("%04d - %04d = %04d\n", max, min, number);
                break;
            }
            System.out.printf("%04d - %04d = %04d\n", max, min, number); 
		}

	}
	public static int Min(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for(int i=0;i<4;i++) {
			temp = temp*10 + (array[i] - '0');
		}
		return temp;
	}
	public static int Max(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for(int i=3;i>-1;i--) {
			temp = temp*10 + (array[i] - '0');
		}
		return temp;
	}

}
