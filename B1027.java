/*
1027. 打印沙漏(20) 
本题要求你写个程序把给定的符号打印成沙漏的形状。例如给定17个“*”，要求按下列格式打印
*****
 ***
  *
 ***
*****
所谓“沙漏形状”，是指每行输出奇数个符号；各行符号中心对齐；相邻两行符号数差2；符号数先从大到小顺序递减到1，再从小到大顺序递增；首尾符号数相等。
给定任意N个符号，不一定能正好组成一个沙漏。要求打印出的沙漏能用掉尽可能多的符号。
输入格式：
输入在一行给出1个正整数N（<=1000）和一个符号，中间以空格分隔。
输出格式：
首先打印出由给定符号组成的最大的沙漏形状，最后在一行中输出剩下没用掉的符号数。
 */
import java.util.Scanner;

public class B1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char ch = sc.next().charAt(0);
		sc.close();
		Rows(num,ch);
	}
	public static void Rows(int num,char ch) {
		int row = -1;
		while(num - row >= 0) {
			row = row + 2;
			num = num - row*2;
		}
		num++;
		int len =(row+1)/2;
		String[] str = new String[len];
		for(int i=0;i<len;i++) {
			char[] chs = new char[row];
			for(int j=0;j<(len+i);j++) {
				if(j < len-i-1) 
					chs[j] = ' ';
				else
					chs[j] = ch;
			}
			str[i] = new String(chs,0,len+i);
		}
		for(int i=(len-1);i>0;i--) 
			System.out.println(str[i]);
		for(String s:str) {
			System.out.println(s);
		}
		System.out.println(num);
	}
}
