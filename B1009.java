/*
1009. ˵���� (20)
����һ��Ӣ�Ҫ�����д���򣬽��������е��ʵ�˳��ߵ������
�����ʽ�������������һ��������������һ���ڸ����ܳ��Ȳ�����80���ַ������ַ��������ɵ��ʺ����ɿո���ɣ����е�������Ӣ����ĸ����Сд�����֣���ɵ��ַ���������֮����1���ո�ֿ������뱣֤����ĩβû�ж���Ŀո�
�����ʽ��ÿ���������������ռһ�У���������ľ��ӡ�
 */
import java.util.Scanner;

public class B1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
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
