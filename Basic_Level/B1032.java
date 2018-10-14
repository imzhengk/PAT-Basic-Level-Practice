package Basic_Level;
/*
1032. 挖掘机技术哪家强(20) 
为了用事实说明挖掘机技术到底哪家强，PAT组织了一场挖掘机技能大赛。现请你根据比赛结果统计出技术最强的那个学校。 
输入格式： 
输入在第1行给出不超过10^5的正整数N，即参赛人数。随后N行，每行给出一位参赛者的信息和成绩，
包括其所代表的学校的编号（从1开始连续编号）、及其比赛成绩（百分制），中间以空格分隔。 
输出格式： 
在一行中给出总得分最高的学校的编号、及其总分，中间以空格分隔。题目保证答案唯一，没有并列。 
 */
//最后运行超时
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
