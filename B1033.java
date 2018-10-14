/*
1033. 旧键盘打字(20) 
旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及坏掉的那些键，打出的结果文字会是怎样？ 
输入格式： 
输入在2行中分别给出坏掉的那些键、以及应该输入的文字。其中对应英文字母的坏键以大写给出；每段文字是不超过105个字符的串。可用的字符包括字母[a-z, A-Z]、数字0-9、以及下划线“_”（代表空格）、“,”、“.”、“-”、“+”（代表上档键）。题目保证第2行输入的文字串非空。 
注意：如果上档键坏掉了，那么大写的英文字母无法被打出。 
输出格式： 
在一行中输出能够被打出的结果文字。如果没有一个字符能被打出，则输出空行。 
 */
//运行超时
import java.util.ArrayList;
import java.util.Scanner;

public class B1033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bad = sc.nextLine();
		char[] good = sc.nextLine().toCharArray();
		sc.close();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<good.length;i++) {
			if(bad.contains("+")) {
				if(good[i] >= 'A' && good[i] <= 'Z') {
					continue;
				}
			}
			if(!bad.contains(Character.toUpperCase(good[i])+""))
				list.add(good[i]+"");
		}
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i));
	}
}
