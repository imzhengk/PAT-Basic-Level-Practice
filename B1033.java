/*
1033. �ɼ��̴���(20) 
�ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ���������Щ��������Ľ�����ֻ��������� 
�����ʽ�� 
������2���зֱ������������Щ�����Լ�Ӧ����������֡����ж�ӦӢ����ĸ�Ļ����Դ�д������ÿ�������ǲ�����105���ַ��Ĵ������õ��ַ�������ĸ[a-z, A-Z]������0-9���Լ��»��ߡ�_��������ո񣩡���,������.������-������+���������ϵ���������Ŀ��֤��2����������ִ��ǿա� 
ע�⣺����ϵ��������ˣ���ô��д��Ӣ����ĸ�޷�������� 
�����ʽ�� 
��һ��������ܹ�������Ľ�����֡����û��һ���ַ��ܱ��������������С� 
 */
//���г�ʱ
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
