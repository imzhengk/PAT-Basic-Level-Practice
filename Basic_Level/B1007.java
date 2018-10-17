package Basic_Level;

/*
1007. 素数对猜想 (20)
让我们定义 dn 为：dn = pn+1 – pn，其中 pi 是第i个素数。显然有 d1=1 且对于n>1有 dn 是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
现给定任意正整数N (< 105)，请计算不超过N的满足猜想的素数对的个数。
输入格式：每个测试输入包含1个测试用例，给出正整数N。
输出格式：每个测试用例的输出占一行，不超过N的满足猜想的素数对的个数。
 */

import java.util.Scanner;

public class B1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int total = 0;
		for(int i=3;i<=n;i++) {
			if(isPrime(i) && isPrime(i-2)) {
				total++;
			}
		}
		System.out.println(total);

	}
	public static boolean isPrime(int n) {
		if(n <= 3) {
			return n > 1;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
