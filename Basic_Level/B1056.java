package Basic_Level;

/*
1056 组合数的和 （15 分）
给定 N 个非 0 的个位数字，用其中任意 2 个数字都可以组合成 1 个 2 位的数字。要求所有可能组合出来的 2 位数字的和。
例如给定 2、5、8，则可以组合出：25、28、52、58、82、85，它们的和为330。
输入格式：
输入在第一行中给出 N（1 < N < 10），随后一行给出 N 个不同的非 0 个位数字。数字间以空格分隔。
输出格式：
输出所有可能组合出来的2位数字的和。
 */

import java.util.Scanner;

public class B1056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] fig = new int[n];
		for(int i=0;i<n;i++)
			fig[i] = sc.nextInt();
		sc.close();
		int total = 0;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++) {
				if(i!=j)
					total = total + fig[i]*10 + fig[j];
			}
		System.out.println(total);
	}
}
