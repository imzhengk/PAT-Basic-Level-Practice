package Basic_Level;

/*
1002 写出这个数 （20 分）
读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
输入格式：每个测试输入包含 1 个测试用例，即给出自然数 n 的值。
输出格式：在一行内输出 n 的各位数字之和的每一位，拼音数字间有 1 空格，但一行中最后一个拼音数字后没有空格。
输入样例：1234567890987654321123456789
输出样例：yi san wu
*/

import java.util.Scanner;
public class B1002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		scanner.close();
		char [] CharArray = s.toCharArray();
		int sum = 0;
		for(char c:CharArray) {
			sum = sum + (int)c - (int)'0';
		}
		String snum = String.valueOf(sum);
		char [] CharNum = snum.toCharArray();
		String allHan = new String();
		for(char ch:CharNum) {
			String han = new String();
			switch(ch) {
			case '0': han = "ling";break;
			case '1': han = "yi";break;
			case '2': han = "er";break;
			case '3': han = "san";break;
			case '4': han = "si";break;
			case '5': han = "wu";break;
			case '6': han = "liu";break;
			case '7': han = "qi";break;
			case '8': han = "ba";break;
			case '9': han = "jiu";break;
			}
			allHan = allHan + han + " ";
		}
		System.out.println(allHan.trim());
	}

}
