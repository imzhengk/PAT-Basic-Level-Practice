package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1049 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] sequence = new double[n];
		String[] str = br.readLine().split("\\s+");
		for(int i=0;i<n;i++) {
			sequence[i] = Double.parseDouble(str[i]);
		}
		double sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					sum = sum + sequence[k];
				}
			}
		}
		System.out.printf("%.2f",sum);
	}
}
