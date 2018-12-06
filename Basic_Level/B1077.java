package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B1077 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s+");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		for(int i=0;i<N;i++) {
			String[] temp = br.readLine().split("\\s+");
			List<Integer> list = new ArrayList<Integer>();
			int teacher = Integer.parseInt(temp[0]);
			for(int j=1;j<N;j++) {
				int tnum = Integer.parseInt(temp[j]);
				if(tnum>=0 && tnum<=M) {
					list.add(tnum);
				}
			}
			Collections.sort(list);
			int num = 0;
			for(int j=1;j<list.size()-1;j++) {
				num = (num + list.get(j));
			}
			long answer = Math.round((teacher+(num / (list.size()-2)*1.0))/2.0);
			System.out.println(answer);
		}
	}
}
