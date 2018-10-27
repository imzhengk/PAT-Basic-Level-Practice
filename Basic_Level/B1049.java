package Basic_Level;

/*
1049. 数列的片段和(20) 
给定一个正数数列，我们可以从中截取任意的连续的几个数，称为片段。例如，给定数列{0.1, 0.2, 0.3, 0.4}，我们有(0.1) (0.1, 0.2) (0.1, 0.2, 0.3) (0.1, 0.2, 0.3, 0.4) (0.2) (0.2, 0.3) (0.2, 0.3, 0.4) (0.3) (0.3, 0.4) (0.4) 这10个片段。 
给定正整数数列，求出全部片段包含的所有的数之和。如本例中10个片段总和是0.1 + 0.3 + 0.6 + 1.0 + 0.2 + 0.5 + 0.9 + 0.3 + 0.7 + 0.4 = 5.0。 
输入格式： 
输入第一行给出一个不超过105的正整数N，表示数列中数的个数，第二行给出N个不超过1.0的正数，是数列中的数，其间以空格分隔。 
输出格式： 
在一行中输出该序列所有片段包含的数之和，精确到小数点后2位。 
 */
//运行超时

import java.util.Scanner;

public class B1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		double[] sequence = new double[n];
		for(int i=0;i<n;i++) {
			sequence[i] = sc.nextDouble();
		}
		sc.close();
		double sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					sum = sum + sequence[k];
				}
			}
		}
		System.out.printf("%.2f",sum);
	}
}
