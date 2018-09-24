/*
1001 害死人不偿命的(3n+1)猜想 （15 分）
对任何一个正整数 n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把 (3n+1) 砍掉一半。反复砍下去，最后一定得到 n=1。
我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过 1000 的正整数 n，简单地数一下，需要多少步（砍几下）才能得到 n=1？
输入格式：每个测试输入包含 1 个测试用例，即给出正整数 n 的值。
输出格式：输出从 n 计算到 1 需要的步数。
输入样例：3
输出样例：5
*/
import java.util.Scanner;
public class B1001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int step = 0;
		while(num != 1) {
			if(num % 2 == 0) {
				step = step + 1;
				num = num/2;
			}
			else {
				step = step + 1;
				num = (3*num + 1)/2;
			}
		}
		System.out.println(step);
	}

}
