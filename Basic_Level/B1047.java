package Basic_Level;

/*
1047. 编程团体赛(20) 
编程团体赛的规则为：每个参赛队由若干队员组成；所有队员独立比赛；参赛队的成绩为所有队员的成绩和；
成绩最高的队获胜。现给定所有队员的比赛成绩，请你编写程序找出冠军队。 
输入格式： 
输入第一行给出一个正整数N（<=10000），即所有参赛队员总数。随后N行，每行给出一位队员的成绩，格式为：“队伍编号-队员编号 成绩”，
其中“队伍编号”为1到1000的正整数，“队员编号”为1到10的正整数，“成绩”为0到100的整数。 
输出格式: 
在一行中输出冠军队的编号和总成绩，其间以一个空格分隔。注意：题目保证冠军队是唯一的。 
 */
//运行超时

import java.util.Scanner;

public class B1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] team = new int[1001];
		int maxIndex = 0;
		for(int i=0;i<n;i++) {
			String[] strs = sc.nextLine().split("[ -]");
			int temp = Integer.parseInt(strs[0]);
			team[temp] += Integer.parseInt(strs[2]);
			if(team[maxIndex] < team[temp])
				maxIndex = temp;
		}
		sc.close();
        System.out.println(maxIndex + " " + team[maxIndex]);
	}
}
