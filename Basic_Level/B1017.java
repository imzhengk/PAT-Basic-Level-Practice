package Basic_Level;
/*
1017 A除以B （20 分）
本题要求计算 A/B，其中 A 是不超过 1000 位的正整数，B 是 1 位正整数。你需要输出商数 Q 和余数 R，使得 A=B×Q+R 成立。
输入格式：
输入在一行中依次给出 A 和 B，中间以 1 空格分隔。
输出格式：
在一行中依次输出 Q 和 R，中间以 1 空格分隔。
 */
//运行超时
import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class B1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		BigInteger bigOne = sc.nextBigInteger();
		BigInteger bigTwo = sc.nextBigInteger();
		sc.close();
		BigInteger[] result = bigOne.divideAndRemainder(bigTwo);
		System.out.print(result[0] + " " + result[1]);
	}
}
