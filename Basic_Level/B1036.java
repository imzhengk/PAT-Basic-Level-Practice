package Basic_Level;

/*
1036. 跟奥巴马一起编程(15) 
美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。
2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！ 
输入格式： 
输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。 
输出格式： 
输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的行数实际上是列数的50%（四舍五入取整）。 
 */

import java.util.Scanner;

public class B1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		char ch = sc.next().charAt(0);
		sc.close();
		int row = (len + 1)/2 - 2;
		StringBuffer buffer = new StringBuffer();
		StringBuffer bufferrow = new StringBuffer();
		for(int i=0;i<len;i++) {
			buffer.append(ch);
			if(i==0 || i==(len-1))
				bufferrow.append(ch);
			else
				bufferrow.append(" ");
		}
		System.out.println(buffer);
		for(int i=0;i<row;i++) {
			System.out.println(bufferrow);
		}
		System.out.println(buffer);
	}
}
