/*
1010. һԪ����ʽ�� (25)
��ƺ�����һԪ����ʽ�ĵ�������ע��x^n��nΪ��������һ�׵���Ϊn*x^(n-1)����
�����ʽ����ָ���ݽ���ʽ�������ʽ������ϵ����ָ��������ֵ��Ϊ������1000�������������ּ��Կո�ָ���
�����ʽ������������ͬ�ĸ�ʽ�����������ʽ�������ϵ����ָ�������ּ��Կո�ָ�������β�����ж���ո�ע�⡰�����ʽ����ָ����ϵ������0�����Ǳ�ʾΪ��0 0����
 */
import java.util.Scanner;
public class B1010_NoFinish {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[50];
		int num = 0;
		while(sc.hasNextInt()) {
			c[num++] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<c.length;i=i+2) {
			if(c[i+1]==0) continue;
			else {
				c[i] = c[i]*c[i+1];
				c[i+1] = c[i+1]-1;
			}
		}
		for(int i=0;i<c.length;i++) {
			if(c[i]==0)
				System.out.print(c[i]);
			if(c[i]!=0) 
				System.out.print(c[i] + " ");
		}

	}

}
