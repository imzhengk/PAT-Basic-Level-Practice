package Basic_Level;
/*
1017 A����B ��20 �֣�
����Ҫ����� A/B������ A �ǲ����� 1000 λ����������B �� 1 λ������������Ҫ������� Q ������ R��ʹ�� A=B��Q+R ������
�����ʽ��
������һ�������θ��� A �� B���м��� 1 �ո�ָ���
�����ʽ��
��һ����������� Q �� R���м��� 1 �ո�ָ���
 */
//���г�ʱ
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class B1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		BigInteger bigOne = sc.nextBigInteger();
		BigInteger bigTwo = sc.nextBigInteger();
		sc.close();
		BigInteger[] result = bigOne.divideAndRemainder(bigTwo);
		System.out.print(result[0] + " " + result[1]);
	}
}
