package Basic_Level;

import java.util.Scanner;

public class B1073_Copy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] hash = {1, 2, 4, 8, 16};
		int[] score = new int[m]; // score of each question
		int[] trueAns = new int[m]; //true answer
		int[][] ans = new int[n][m]; // the students answers
		int[][] miss = new int[m][5]; // missing freq for each question, each choice
		// score and true answer
		for (int i = 0; i < m; i++) {
			score[i] = sc.nextInt();
			int numberOfAns = sc.nextInt(); // useless?
			int numberOfTrueAns = sc.nextInt();
			for (int j = 0; j < numberOfTrueAns; j++) {
				trueAns[i] += hash[sc.next().charAt(0) - 'a'];
			}
		}
		// read answers
		// for each student
		for (int i = 0; i < n; i++) {
			// for each question
			double points = 0;
			for (int j = 0; j < m; j++) {
				String s = sc.next();
				int numberOfAns = Integer.parseInt(String.valueOf(s.charAt(1)));
				// read each answer
				for (int k = 0; k < numberOfAns; k++) {
					char c = sc.next().charAt(0);
					ans[i][j] += hash[c - 'a'];
				}
				int flag = ans[i][j] ^ trueAns[j]; // flag 0: all right 1: missing or wrong
				if (flag != 0) {
					// missing or wrong answers
					if ((ans[i][j] | trueAns[j]) == trueAns[j]) {
						// no wrong answers
						points += score[j] / 2.0;
					}
					if ((flag & hash[0]) != 0) miss[j][0]++; // a is missing
					if ((flag & hash[1]) != 0) miss[j][1]++; // b
					if ((flag & hash[2]) != 0) miss[j][2]++; // c
					if ((flag & hash[3]) != 0) miss[j][3]++; // d
					if ((flag & hash[4]) != 0) miss[j][4]++; // e
				} else {
					// all right
					points += score[j];
				}
			}
			// output points for each students
			System.out.printf("%.1f\n", points);
		}
		int maxErrorCount = 0;
		// find the max error count
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < miss[i].length; j++) {
				maxErrorCount = Math.max(maxErrorCount, miss[i][j]);
			}
		}
		// output results
		if (maxErrorCount == 0) {
			System.out.println("Too simple");
		} else {
			// compare max error count with each question and choice
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < miss[i].length; j++) {
					if (maxErrorCount == miss[i][j]) {
						System.out.printf("%d %d-%c\n", maxErrorCount, i + 1, 'a' + j);
					}
				}
			}
		}
	}
}
