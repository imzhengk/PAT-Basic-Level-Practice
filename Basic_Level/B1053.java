package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1053 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		double e = Double.parseDouble(str[1]);
		int d = Integer.parseInt(str[2]);
		int vacant = 0;
		int maybeVacant = 0;
		for(int i=0;i<n;i++) {
			String[] shuju = br.readLine().split(" ");
			int days = Integer.parseInt(shuju[0]);
			int va = 0;
			for(int j=1;j<=days;j++) {
				if(Double.parseDouble(shuju[j]) < e)
					va++;
			}
			if(va > days/2) {
				if(days > d)
					vacant++;
				else
					maybeVacant++;
			}
		}
		System.out.printf("%.1f%% %.1f%%",maybeVacant*1.0/n*100,vacant*1.0/n*100);
	}
}
