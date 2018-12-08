package Basic_Level;

import java.util.Scanner;

public class B1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		boolean first = false;
		int temp = 0;
		for(int i=0;i<10;i++) {
			num[i] = sc.nextInt();
			if(num[i]!=0 && i>0 && !first) {
				temp = i;
				num[i]--;
				first = true;
			}
		}
		sc.close();
		System.out.print(temp);
		for(int i=0;i<10;i++) {
			for(int j=num[i];j>0;j--)
				System.out.print(i);
		}
	}
}
