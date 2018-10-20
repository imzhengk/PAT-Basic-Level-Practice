package Basic_Level;
/*
1009. 说反话 (20)
给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
输入格式：测试输入包含一个测试用例，在一行内给出总长度不超过80的字符串。字符串由若干单词和若干空格组成，
其中单词是由英文字母（大小写有区分）组成的字符串，单词之间用1个空格分开，输入保证句子末尾没有多余的空格。
输出格式：每个测试用例的输出占一行，输出倒序后的句子。
 */
import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		sc.close();
		reverseTalk(words);
	}
	public static void reverseTalk(String words) {
		String[] word = words.split(" ");
		for(int i=word.length-1;i>0;i--) {
			System.out.print(word[i] + " ");
		}
		System.out.println(word[0]);
	}
}
