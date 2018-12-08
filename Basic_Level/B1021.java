package Basic_Level;

import java.util.Scanner;
public class B1021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] number = sc.next().toCharArray();
		sc.close();
		int[] result = {0,0,0,0,0,0,0,0,0,0};
		for(char c:number) {
			int temp = c - '0';
			result[temp] = result[temp] + 1;
		}
		for(int i=0;i<10;i++) {
			if(result[i]!=0) {
				System.out.println(i + ":" + result[i]);
			}
		}
	}

}
