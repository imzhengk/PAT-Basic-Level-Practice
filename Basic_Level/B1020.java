package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B1020 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int demand = Integer.parseInt(str[1]);
		Map<Double,Integer> map = new HashMap<Double,Integer>();
		String[] tempa = br.readLine().split(" ");
		String[] tempb = br.readLine().split(" ");
		int[][] total = new int[2][n];
		double[] unit = new double[n];
		for(int i=0;i<n;i++) {
			total[0][i] = Integer.parseInt(tempa[i]);
			total[1][i] = Integer.parseInt(tempb[i]);
			unit[i] = (double)total[1][i]/(double)total[0][i];
			map.put(unit[i], i);
		}
		Arrays.sort(unit);
		int[] number = new int[n];
		int[] price = new int[n];
		for(int i=0;i<n;i++) {
			int temp = (int) map.get(unit[i]);
			number[i] = total[0][temp];
			price[i] = total[1][temp];
		}
		int sum = 0;
		double prices = 0;
		for(int i=n-1;i>=0;i--) {
			if(sum + number[i] < demand) {
				sum = sum + number[i];
				prices = prices + price[i];
			}
			else if(sum + number[i] >= demand) {
				int temp = demand - sum;
				prices = prices + unit[i]*(double)temp;
				break;
			}
		}
		System.out.printf("%.2f",prices);
	}
}
