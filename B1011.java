/*
1011 A+B 和 C （15 分）
给定区间 [−2 31,2 31] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
输入格式：
输入第 1 行给出正整数 T (≤10)，是测试用例的个数。随后给出 T 组测试用例，每组占一行，顺序给出 A、B 和 C。整数间以空格分隔。
输出格式：
对每组测试用例，在一行中输出 Case #X: true 如果 A+B>C，否则输出 Case #X: false，其中 X 是测试用例的编号（从 1 开始）。
*/
import java.util.Arrays;
import java.util.Scanner;
public class B1011 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long[][] num = new long[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				num[i][j] = scanner.nextLong();
			}
		}
		for(int i=0;i<n;i++) {
			boolean flag = false;
			if(num[i][0]+num[i][1] > num[i][2]) {
				flag = true;
				System.out.printf("Case #%d: %s\n",i+1,flag);
			}
			else {
				System.out.printf("Case #%d: %s\n",i+1,flag);
			}
		}
	}
}
