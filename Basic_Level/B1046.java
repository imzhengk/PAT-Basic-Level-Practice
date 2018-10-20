package Basic_Level;

/*
1046. 划拳(15) 
划拳是古老中国酒文化的一个有趣的组成部分。酒桌上两人划拳的方法为：每人口中喊出一个数字，同时用手比划出一个数字。如果谁比划出的数字正好等于两人喊出的数字之和，谁就赢了，输家罚一杯酒。两人同赢或两人同输则继续下一轮，直到唯一的赢家出现。 
下面给出甲、乙两人的划拳记录，请你统计他们最后分别喝了多少杯酒。 
输入格式： 
输入第一行先给出一个正整数N（<=100），随后N行，每行给出一轮划拳的记录，格式为： 
甲喊 甲划 乙喊 乙划 
其中“喊”是喊出的数字，“划”是划出的数字，均为不超过100的正整数（两只手一起划）。 
输出格式： 
在一行中先后输出甲、乙两人喝酒的杯数，其间以一个空格分隔。 
 */

import java.util.Scanner;

public class B1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = new String[n];
		for(int i=0;i<n;i++)
			str[i] = sc.nextLine();
		sc.close();
		int jia = 0;
		int yi = 0;
		for(int i=0;i<n;i++) {
			String[] row = str[i].split(" ");
			int total = Integer.parseInt(row[0]) + Integer.parseInt(row[2]);
			int a = Integer.parseInt(row[1]);
			int b = Integer.parseInt(row[3]);
			if(total==a && total!=b)
				yi++;
			if(total==b && total!=a)
				jia++;
		}
		System.out.println(jia + " " + yi);
	}
}
