package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//运行超时s
public class B1082 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> numList = new ArrayList<Integer>();
		String[] str = new String[N];
		for(int i=0;i<N;i++) {
			String[] temp = br.readLine().split(" ");
			str[i] = temp[0];
			numList.add((int) (Math.pow(Integer.parseInt(temp[1]),2)) + (int) (Math.pow(Integer.parseInt(temp[2]),2)));
		}
		System.out.println(str[numList.indexOf(Collections.min(numList))] + " " + str[numList.indexOf(Collections.max(numList))]);
	}
}
