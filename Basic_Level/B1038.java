package Basic_Level;

/*
1038. 统计同成绩学生(20) 
本题要求读入N名学生的成绩，将获得某一给定分数的学生人数输出。 
输入格式： 
输入在第1行给出不超过 10^5 的正整数N，即学生总人数。随后1行给出N名学生的百分制整数成绩，中间以空格分隔。最后1行给出要查询的分数个数K（不超过N的正整数），随后是K个分数，中间以空格分隔。 
输出格式： 
在一行中按查询顺序给出得分等于指定分数的学生人数，中间以空格分隔，但行末不得有多余空格。 
 */

import java.util.Scanner;

public class B1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] grades = sc.nextLine().split(" ");
		String[] check = sc.nextLine().split(" ");
		sc.close();
		int m = Integer.parseInt(check[0]);
		int[] answer = new int[m];
		for(int i=1;i<=m;i++) {
			for(int j=0;j<n;j++) {
				if(grades[j].equals(check[i])) 
					answer[i-1]++;
			}
			System.out.print(answer[i-1]);
			if(i < m)
				System.out.print(" ");
		}
	}
}
