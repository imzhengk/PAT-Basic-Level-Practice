package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B1055 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s+");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		List<Person> list = new ArrayList<Person>();
		for(int i=0;i<N;i++) {
			String[] temp = br.readLine().split("\\s+");
			Person tmp = new Person(temp[0],Integer.parseInt(temp[1]));
			list.add(tmp);
		}
		Collections.sort(list);
		int last = N - N/K*(K-1);
		String[] people = new String[last];
		int mid = last/2;
		int left = mid - 1;
		int right = mid;
		boolean flag = true;
		for(int i=0;i<last;i++) {
			if(flag) {
				people[right] = list.get(i).name;
				right++;
				flag = false;
			}
			else {
				people[left] = list.get(i).name;
				left--;
				flag = true;
			}
		}
		StringBuffer sb = new StringBuffer();
		for(String tstr : people) {
			sb.append(tstr + " ");
		}
		System.out.println(sb.toString().trim());
		int each = N/K;
		for(int p=0;p<(K-1);p++) {
			int t = p*each + last;
			people = new String[each];
			mid = each/2;
			left = mid - 1;
			right = mid;
			flag = true;
			for(int i=0;i<each;i++) {
				if(flag) {
					people[right] = list.get(t+i).name;
					right++;
					flag = false;
				}
				else {
					people[left] = list.get(t+i).name;
					left--;
					flag = true;
				}
			}
			StringBuffer sbf = new StringBuffer();
			for(String tstr : people) {
				sbf.append(tstr + " ");
			}
			System.out.println(sbf.toString().trim());
		}				
	}
}
class Person implements Comparable<Person> {
	String name;
	int height;
	public Person(String name,int height){
		this.name = name;
		this.height = height;
	}
	@Override
	public int compareTo(Person o) {
		if(this.height == o.height)
			return this.name.compareTo(o.name);
		return o.height - this.height;
	}	
}
