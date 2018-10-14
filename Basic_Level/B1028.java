package Basic_Level;
/*
1028. 人口普查(20) 
某城镇进行人口普查，得到了全体居民的生日。现请你写个程序，找出镇上最年长和最年轻的人。这里确保每个输入的日期都是合法的，
但不一定是合理的——假设已知镇上没有超过200岁的老人，而今天是2014年9月6日，
所以超过200岁的生日和未出生的生日都是不合理的，应该被过滤掉。 
输入格式： 
输入在第一行给出正整数N，取值在(0, 10^5]；随后N行，每行给出1个人的姓名（由不超过5个英文字母组成的字符串）、
以及按“yyyy/mm/dd”（即年/月/日）格式给出的生日。题目保证最年长和最年轻的人没有并列。 
输出格式： 
在一行中顺序输出有效生日的个数、最年长人和最年轻人的姓名，其间以空格分隔。 
 */
//运行超时
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
