package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B1087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=1;i<=N;i++) {
			map.put(i/2 + i/3 + i/5, 0);
		}
		System.out.println(map.size());
	}
}
