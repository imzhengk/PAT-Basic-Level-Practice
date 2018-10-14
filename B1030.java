/*
1030. 完美数列(25) 
给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。 
现在给定参数p和一些正整数，请你从中选择尽可能多的数构成一个完美数列。 
输入格式： 
输入第一行给出两个正整数N和p，其中N（<= 10^5）是输入的正整数的个数，p（<= 10^9）是给定的参数。第二行给出N个正整数，每个数不超过10^9。 
输出格式： 
在一行中输出最多可以选择多少个数可以用它们组成一个完美数列。
*/
//部分正确
import java.util.Arrays;
import java.util.Scanner;

public class B1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int p = sc.nextInt();
		int[] list = new int[num];
		for(int i=0;i<num;i++) {
				list[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(list);
		int max = 1;
		for(int i=num-1;i>1;i--) {
			for(int j=i-max+1;j>0;j--) {
				if(list[i] <= list[j]*p && list[i] > list[j-1]*p)
					break;
				max++;
			}
		}
		System.out.println(max);
	}
}
