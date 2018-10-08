/*
1010. 一元多项式求导 (25)
设计函数求一元多项式的导数。（注：x^n（n为整数）的一阶导数为n*x^(n-1)。）
输入格式：以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过1000的整数）。数字间以空格分隔。
输出格式：以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。注意“零多项式”的指数和系数都是0，但是表示为“0 0”。
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
