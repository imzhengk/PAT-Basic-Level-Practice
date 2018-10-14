package Basic_Level;
/*
1029. 旧键盘(20) 
旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出肯定坏掉的那些键。 
输入格式： 
输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。 
输出格式： 
按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class B1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] good = sc.nextLine().toUpperCase().toCharArray();
		char[] bad = sc.nextLine().toUpperCase().toCharArray();
		sc.close();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<good.length;i++) {
			boolean flag = true;
			for(int j=0;j<bad.length;j++) {
				if(good[i] == bad[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				if(!list.contains(good[i]+""))
					list.add(good[i]+"");
			}
		}
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i));
	}
}
