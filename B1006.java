/*
1006 换个格式输出整数 （15 分）
让我们用字母 B 来表示“百”、字母 S 表示“十”，用 12...n 来表示个位数字 ，换个格式来输出任一个不超过 3 位的正整数。
例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
输入格式：
每个测试输入包含 1 个测试用例，给出正整数 n（<1000）。
输出格式：
每个测试用例的输出占一行，用规定的格式输出 n。
*/
import java.util.Scanner;
public class B1006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char [] ch = str.toCharArray();
		if(str.length()==1) {
			Single single = new Single(ch[0]);
			single.show();
		}
		if(str.length()==2) {
			Ten ten = new Ten(ch[0]);
			ten.show();
			Single single = new Single(ch[1]);
			single.show();
		}
		if(str.length()==3) {
			Hundred hundred = new Hundred(ch[0]);
			hundred.show();
			Ten ten = new Ten(ch[1]);
			ten.show();
			Single single = new Single(ch[2]);
			single.show();
		}
	}
}

class Single{
	char ch;
	Single(char ch){
		this.ch = ch;
	}
	void show() {
		int num = (int)ch - (int)'0';
		if(num != 0) {
			for(int i=1;i<=num;i++) {
				char c = (char)(i+(int)'0');
				System.out.print(c);
			}
		}
	}
}

class Ten{
	char ch;
	Ten(char ch){
		this.ch = ch;
	}
	void show() {
		int num = (int)ch - (int)'0';
		if(num != 0) {
			for(int i=1;i<=num;i++) {
				System.out.print('S');
			}
		}
	}
}

class Hundred{
	char ch;
	Hundred(char ch){
		this.ch = ch;
	}
	void show() {
		int num = (int)ch - (int)'0';
		if(num != 0) {
			for(int i=1;i<=num;i++) {
				System.out.print('B');
			}
		}
	}
}

