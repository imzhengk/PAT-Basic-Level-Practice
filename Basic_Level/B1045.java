package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//后4个测试点超时

public class B1045 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("\\s+");
        int[] a = new int[n];
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		for(int i=0;i<n;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(a[i]<a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				for(int k=n-1;k>i;k--) {
					if(a[i]>a[k]) {
						flag = true;
						break;
					}
				}
			}
			if(!flag) {
				list.add(a[i]);
			}						
		}
		System.out.println(list.size());
		boolean f = false;
		for(int i : list) {
			if(!f) {
				f = true;
				System.out.print(i);
			}
			else {
				System.out.print(" " + i);
			}
		}
	}
}
