package Basic_Level;
/*
1024. 科学计数法 (20) 
科学计数法是科学家用来表示很大或很小的数字的一种方便的方法，其满足正则表达式[+-][1-9]”.”[0-9]+E[+-][0-9]+，即数字的整数部分只有1位，小数部分至少有1位，该数字及其指数部分的正负号即使对正数也必定明确给出。 
现以科学计数法的格式给出实数A，请编写程序按普通数字表示法输出A，并保证所有有效位都被保留。 
输入格式： 
每个输入包含1个测试用例，即一个以科学计数法表示的实数A。该数字的存储长度不超过9999字节，且其指数的绝对值不超过9999。 
输出格式： 
对每个测试用例，在一行中按普通数字表示法输出A，并保证所有有效位都被保留，包括末尾的0。 
 */
//神级操作，哈哈哈
import java.math.BigDecimal;
import java.util.Scanner;

public class B1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal n = sc.nextBigDecimal();
		sc.close();
		System.out.println(n.toPlainString());
	}
}
