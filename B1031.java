/*
1031. �������֤(15) 
һ���Ϸ������֤������17λ���������ڱ�ź�˳���ż�1λУ������ɡ�У����ļ���������£� 
���ȶ�ǰ17λ���ּ�Ȩ��ͣ�Ȩ�ط���Ϊ��{7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2}�� 
Ȼ�󽫼���ĺͶ�11ȡģ�õ�ֵZ����������¹�ϵ��ӦZֵ��У����M��ֵ�� 
Z��0 1 2 3 4 5 6 7 8 9 10
M��1 0 X 9 8 7 6 5 4 3 2 
���ڸ���һЩ���֤���룬������֤У�������Ч�ԣ������������ĺ��롣 
�����ʽ�� 
�����һ�и���������N��<= 100������������֤����ĸ��������N�У� 
ÿ�и���1��18λ���֤���롣 
�����ʽ�� 
���������˳��ÿ�����1������������֤���롣���ﲢ������ǰ17λ�Ƿ����ֻ���ǰ17λ�Ƿ�ȫΪ���������1λУ�������׼ȷ��
������к��붼�������������All passed����
 */
import java.util.Scanner;

public class B1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int temp = 0;
		for(int i=0;i<num;i++) {
			String str = sc.nextLine();
			if(Judge(str))
				temp++;			
		}
		sc.close();
		if(temp==num)
			System.out.println("All passed");
	}
	public static boolean Judge(String str) {
		int check = 0;
		int[] weights = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] digs = str.toCharArray();
		Boolean flag = false;
		for(int i=0;i<17;i++) {
			if(digs[i] >= '0' && digs[i] <='9') {
				int dig = (int)(digs[i] - '0');
				check = check + dig*weights[i];
				if(i==16)
					flag = true;
			}
			else {
				flag = false;
				System.out.println(str);
				break;
			}
		}
		check = check % 11;
		if(flag) {
			char match = Match(check);
			if(match == digs[17])
				return flag;
			else {
				flag = false;
				System.out.println(str);
				return flag;
			}
		}
		else
			return flag;
	}
	public static char Match(int check) {
		int[] z = { 0,1,2,3,4,5,6,7,8,9,10 };
		char[] m = { '1','0','X','9','8','7','6','5','4','3','2' };
		for(int i=0;i<z.length;i++) {
			if(check == z[i]) {
				return m[i];
			}			
		}
		return 0;
	}

}
