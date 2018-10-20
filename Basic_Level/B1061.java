package Basic_Level;

/*
1061 判断题 （15 分）
判断题的评判很简单，本题就要求你写个简单的程序帮助老师判题并统计学生们判断题的得分。
输入格式：
输入在第一行给出两个不超过 100 的正整数 N 和 M，分别是学生人数和判断题数量。第二行给出 M 个不超过 5 的正整数，是每道题的满分值。
第三行给出每道题对应的正确答案，0 代表“非”，1 代表“是”。随后 N 行，每行给出一个学生的解答。数字间均以空格分隔。
输出格式：
按照输入的顺序输出每个学生的得分，每个分数占一行。
 */

import java.util.Scanner;

public class B1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[] grade = sc.nextLine().split(" ");
		String[] answer = sc.nextLine().split(" ");
		String[] stu = new String[n];
		for(int i=0;i<n;i++)
			stu[i] = sc.nextLine();
		sc.close();
		for(int i=0;i<n;i++) {
			int fens = 0;
			String[] stus = stu[i].split(" ");
			for(int j=0;j<m;j++) {
				if(stus[j].equals(answer[j]))
					fens = fens + Integer.parseInt(grade[j]);
			}
			System.out.println(fens);
		}			
	}
}
