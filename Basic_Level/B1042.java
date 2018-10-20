package Basic_Level;

/*
1042 字符统计 （20 分）
请编写程序，找出一段给定文字中出现最频繁的那个英文字母。
输入格式：
输入在一行中给出一个长度不超过 1000 的字符串。字符串由 ASCII 码表中任意可见字符及空格组成，至少包含 1 个英文字母，以回车结束（回车不算在内）。
输出格式：
在一行中输出出现频率最高的那个英文字母及其出现次数，其间以空格分隔。如果有并列，则输出按字母序最小的那个字母。统计时不区分大小写，输出小写字母。
 */

import java.util.Scanner;

public class B1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().toCharArray();
		sc.close();
		int[] num = new int[26];
		for(int i=0;i<chars.length;i++) {
			if(chars[i] >= 'a' && chars[i] <= 'z') {
				int low = chars[i] - 'a';
				num[low]++;
			}
			if(chars[i] >= 'A' && chars[i] <= 'Z') {
				int low = chars[i] - 'A';
				num[low]++;
			}
		}
		int max = num[0];
		int index = 0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
				index = i;
			}
		}
		char ch = (char)((int)'a'+index);
		System.out.println(ch + " " + max);
	}
}
