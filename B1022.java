/*
1022. D���Ƶ�A+B (20) 
���������Ǹ�10��������A��B(<=2^30-1)�����A+B��D (1 < D <= 10)�������� 
�����ʽ�� 
������һ�������θ���3������A��B��D�� 
�����ʽ�� 
���A+B��D�������� 
 */
import java.util.Scanner;

public class B1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt() + sc.nextInt();
		int r = sc.nextInt();
        System.out.print(Integer.toString(total, r));
/*
        String str = "";
		while(total>0) {
			int temp = total % r;
			str = temp + str;
			total = total/r;			
		}
        System.out.print(str);
*/
        
	}

}
