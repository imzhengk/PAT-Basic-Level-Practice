package Basic_Level;

/*
1051. 复数乘法 (15) 
复数可以写成(A + Bi)的常规形式，其中A是实部，B是虚部，i是虚数单位，满足i2 = -1；也可以写成极坐标下的指数形式(R*e(Pi))，
其中R是复数模，P是辐角，i是虚数单位，其等价于三角形式(R(cos(P) + isin(P))。 
现给定两个复数的R和P，要求输出两数乘积的常规形式。 
输入格式： 
输入在一行中依次给出两个复数的R1, P1, R2, P2，数字间以空格分隔。 
输出格式： 
在一行中按照“A+Bi”的格式输出两数乘积的常规形式，实部和虚部均保留2位小数。注意：如果B是负数，则应该写成“A-|B|i”的形式。 
 */
//注意0.00不能用负号

import java.util.Scanner;

public class B1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R1 = sc.nextDouble();
		double P1 = sc.nextDouble();
		double R2 = sc.nextDouble();
		double P2 = sc.nextDouble();
		sc.close();
	    double a = R1*R2*Math.cos((P1+P2));
	    double b = R1*R2*Math.sin(P1+P2);
	    if (Math.abs(a) <= 0.001)
	        System.out.print("0.00");
	    else
	        System.out.printf("%.2f", a);
	    if (b > 0)
	        System.out.printf("+%.2fi", b);
	    else if (Math.abs(b) <= 0.001)
	        System.out.print("+0.00i");
	    else
	        System.out.printf("%.2fi", b);
	}
}
