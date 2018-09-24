/*
1014 ����Ħ˹��Լ�� ��20 �֣�
����̽����Ħ˹�ӵ�һ����ֵ�����������Լ��ɣ� 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm��
����̽�ܿ�������ˣ���������ֵ�����ʵ���Ͼ���Լ���ʱ�������� 14:04��
��Ϊǰ�����ַ����е� 1 ����ͬ�Ĵ�дӢ����ĸ�ǵ� 4 ����ĸ D�����������ģ�
�� 2 ����ͬ���ַ��� E �����ǵ� 5 ��Ӣ����ĸ������һ����ĵ� 14 ����ͷ������һ��� 0 �㵽 23 �������� 0 �� 9���Լ���д��ĸ A �� N ��ʾ����
�������ַ����� 1 ����ͬ��Ӣ����ĸ s �����ڵ� 4 ��λ�ã��� 0 ��ʼ�������ϣ������ 4 ���ӡ�
�ָ��������ַ��������������Ħ˹����õ�Լ���ʱ�䡣
�����ʽ��
������ 4 ���зֱ���� 4 ���ǿա��������ո��ҳ��Ȳ����� 60 ���ַ�����
�����ʽ��
��һ�������Լ���ʱ�䣬��ʽΪ DAY HH:MM������ DAY ��ĳ���ڵ� 3 �ַ���д��
�� MON ��ʾ����һ��TUE ��ʾ���ڶ���WED ��ʾ��������THU ��ʾ�����ģ�FRI ��ʾ�����壬SAT ��ʾ��������SUN ��ʾ�����ա�
 */
import java.util.Scanner;
public class B1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String one = sc.nextLine();
		String two = sc.nextLine();
		String three = sc.nextLine();
		String four = sc.nextLine();
		boolean isDay = false;
		boolean isHour = false;
		for(int i=0;i< one.length() && i< two.length();i++) {
			char c = one.charAt(i);
			if(c == two.charAt(i)) {
				if(isDay && !isHour && ((c >= 'A' && c <= 'N') || Character.isDigit(c))) {
					isHour = true;
					if (c >= '0' && c <= '9') {
                        System.out.print("0" + c);
                    } 
					else {
                        System.out.print(c - 'A' + 10);
                    }
				}
				if(!isDay && c >= 'A' && c <= 'G') {
					isDay = true;
					switch(c) {
					case 'A': System.out.print("MON "); break;
					case 'B': System.out.print("TUE "); break;
					case 'C': System.out.print("WED "); break;
					case 'D': System.out.print("THU "); break;
					case 'E': System.out.print("FRI "); break;
					case 'F': System.out.print("SAT "); break;
					case 'G': System.out.print("SUN "); break;
					}
				}
			}		
		}
		for (int i = 0; i < three.length() && i < four.length(); i++) {
			char c = three.charAt(i);
			if (c == four.charAt(i) && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
				System.out.printf(":%02d", i);
				break;
			}
		}
	}
}
