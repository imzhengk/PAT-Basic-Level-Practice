package Basic_Level;
/*
1029. �ɼ���(20) 
�ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ�ʵ�ʱ���������֣������г��϶���������Щ���� 
�����ʽ�� 
������2���зֱ����Ӧ����������֡��Լ�ʵ�ʱ���������֡�ÿ�������ǲ�����80���ַ��Ĵ�������ĸA-Z��������Сд��������0-9��
�Լ��»��ߡ�_��������ո���ɡ���Ŀ��֤2���ַ������ǿա� 
�����ʽ�� 
���շ���˳����һ������������ļ�������Ӣ����ĸֻ�����д��ÿ������ֻ���һ�Ρ���Ŀ��֤������1�������� 
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
