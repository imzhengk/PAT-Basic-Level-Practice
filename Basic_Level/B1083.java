package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class B1083 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] cha = new int[N];
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>
		(
			new Comparator<Integer>() {
				public int compare(Integer obj1, Integer obj2) {
					return obj2.compareTo(obj1);
				}
			}
		);
		for(int i=0;i<N;i++) {
			cha[i] = Math.abs(i+1-Integer.parseInt(str[i]));
			if(map.containsKey(cha[i])) {
				int value = map.get(cha[i]) + 1;
				map.put(cha[i], value);
			}
			else {
				map.put(cha[i], 1);
			}
		}
		for (int key : map.keySet()) {
			if(map.get(key)>1)
				System.out.println(key + " " + map.get(key));
		}
	}
}
