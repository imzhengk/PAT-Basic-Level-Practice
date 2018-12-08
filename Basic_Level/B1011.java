package Basic_Level;

import java.util.Scanner;

public class B1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] num = new long[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				num[i][j] = sc.nextLong();
			}
		}
		sc.close();
		for(int i=0;i<n;i++) {
			boolean flag = false;
			if(num[i][0]+num[i][1] > num[i][2]) {
				flag = true;
				System.out.printf("Case #%d: %s\n",i+1,flag);
			}
			else {
				System.out.printf("Case #%d: %s\n",i+1,flag);
			}
		}
	}
}
