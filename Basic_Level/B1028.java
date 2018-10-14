package Basic_Level;
/*
1028. �˿��ղ�(20) 
ĳ��������˿��ղ飬�õ���ȫ���������ա�������д�������ҳ��������곤����������ˡ�����ȷ��ÿ����������ڶ��ǺϷ��ģ�
����һ���Ǻ���ġ���������֪����û�г���200������ˣ���������2014��9��6�գ�
���Գ���200������պ�δ���������ն��ǲ�����ģ�Ӧ�ñ����˵��� 
�����ʽ�� 
�����ڵ�һ�и���������N��ȡֵ��(0, 10^5]�����N�У�ÿ�и���1���˵��������ɲ�����5��Ӣ����ĸ��ɵ��ַ�������
�Լ�����yyyy/mm/dd��������/��/�գ���ʽ���������ա���Ŀ��֤���곤�����������û�в��С� 
�����ʽ�� 
��һ����˳�������Ч���յĸ��������곤�˺��������˵�����������Կո�ָ��� 
 */
//���г�ʱ
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class B1028 {
	public final static DateFormat data = new SimpleDateFormat("yyyy/MM/dd");

	static class Person implements Comparable<Person>{
		public String name;
		public Date birthday;
		
		Person(String name,Date birthday){
			this.name = name;
			this.birthday = birthday;
		}
		
		@Override
		public int compareTo(Person p) {
			return this.birthday.compareTo(p.birthday);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Date now = data.parse("2014/09/06");
		Date from = data.parse("1814/09/06");
		List<Person> list = new ArrayList<Person>();
		for(int i=0;i<n;i++) {
			String[] temp = br.readLine().split(" ");
			String pname = temp[0];
			Date date = data.parse(temp[1]);
			if(date.compareTo(now) <= 0 && date.compareTo(from) >=0){
				list.add(new Person(pname,date));
			}
		}
		if(list.size() > 0) {
			Collections.sort(list);
			System.out.print(list.size() + " " + list.get(0).name + " "
	                    + list.get(list.size() - 1).name);
	    } 
		else 
			System.out.println(0);
	}
}
