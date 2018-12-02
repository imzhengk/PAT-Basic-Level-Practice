package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1076 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0;j<4;j++) {
				if(str[j].contains("T")) {
					System.out.print((int)(str[j].charAt(0) - 'A' + 1));
					break;
				}
			}
		}
	}
}
