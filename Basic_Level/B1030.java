package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1030 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int num = Integer.parseInt(in[0]);
		int p = Integer.parseInt(in[1]);
		String[] data = br.readLine().split(" ");
		int[] list = new int[num];
		for (int i = 0; i < num; i++) {
			list[i] = Integer.parseInt(data[i]);
		}
		Arrays.sort(list);
	    int cnt = 1;
	    for (int i = num-1; i >= 1; i--) {
	    	int temp = 1;
	        int M = list[i];
	        for (int j = i-cnt; j >= 0 && M * 1.0 / list[j] <= p ; j--) {
	        	temp = i - j + 1;
	        }
	        cnt = cnt > temp ? cnt : temp;
	    }
	    System.out.println(cnt);
	}
}
