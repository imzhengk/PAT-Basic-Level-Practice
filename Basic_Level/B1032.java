package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1032 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int maxIndex = 1;
		String[] temp;
		int[] scores = new int[100001];
		for(int i=0;i<num;i++) {
			temp = br.readLine().split(" ");
			int tno = Integer.parseInt(temp[0]);
			int tscore = Integer.parseInt(temp[1]);
			scores[tno] = scores[tno] + tscore;
			if(scores[maxIndex] < scores[tno])
				maxIndex = tno;
		}
		System.out.println(maxIndex + " " + scores[maxIndex]);
	}
}
