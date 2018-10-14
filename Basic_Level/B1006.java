package Basic_Level;
/*
1006 ������ʽ������� ��15 �֣�
����������ĸ B ����ʾ���١�����ĸ S ��ʾ��ʮ������ 12...n ����ʾ��λ���� ��������ʽ�������һ�������� 3 λ����������
���� 234 Ӧ�ñ����Ϊ BBSSS1234����Ϊ���� 2 �����١���3 ����ʮ�����Լ���λ�� 4��
�����ʽ��
ÿ������������� 1 ���������������������� n��<1000����
�����ʽ��
ÿ���������������ռһ�У��ù涨�ĸ�ʽ��� n��
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

