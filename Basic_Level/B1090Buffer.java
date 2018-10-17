package Basic_Level;

/*
1090 危险品装箱 （25 分）
集装箱运输货物时，我们必须特别小心，不能把不相容的货物装在一只箱子里。比如氧化剂绝对不能跟易燃液体同箱，否则很容易造成爆炸。
本题给定一张不相容物品的清单，需要你检查每一张集装箱货品清单，判断它们是否能装在同一只箱子里。
输入格式：
输入第一行给出两个正整数：N (≤10 4) 是成对的不相容物品的对数；M (≤100) 是集装箱货品清单的单数。
随后数据分两大块给出。第一块有 N 行，每行给出一对不相容的物品。第二块有 M 行，每行给出一箱货物的清单，格式如下：
K G[1] G[2] ... G[K]
其中 K (≤1000) 是物品件数，G[i] 是物品的编号。简单起见，每件物品用一个 5 位数的编号代表。两个数字之间用空格分隔。
输出格式：
对每箱货物清单，判断是否可以安全运输。如果没有不相容物品，则在一行中输出 Yes，否则输出 No。
 */
//运行超时

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1090Buffer {

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String[] sss = sc.readLine().split(" ");
		int n = Integer.parseInt(sss[0]);
		int m = Integer.parseInt(sss[1]);
		String[][] str = new String[n][2];
		String[] stuffs = new String[m];
		for(int i=0;i<n;i++) {
			str[i] = sc.readLine().split(" ");
		}
		for(int i=0;i<m;i++) {
			stuffs[i] = sc.readLine();
		}
		sc.close();
		for(int i=0;i<m;i++) {
			boolean flag = true;
			for(int k=0;k<n;k++) {
				if(stuffs[i].contains(str[k][0]) && stuffs[i].contains(str[k][1])) {
					System.out.println("No");
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("Yes");
		}
	}
}