package Basic_Level;

/*
1053.住房空置率 (20)
在不打扰居民的前提下，统计住房空置率的一种方法是根据每户用电量的连续变化规律进行判断。判断方法如下： 
在观察期内，若存在超过一半的日子用电量低于某给定的阈值e，则该住房为“可能空置”； 
若观察期超过某给定阈值D天，且满足上一个条件，则该住房为“空置”。 
现给定某居民区的住户用电量数据，请你统计“可能空置”的比率和“空置”比率，即以上两种状态的住房占居民区住房总套数的百分比。 
输入格式： 
输入第一行给出正整数N（<=1000），为居民区住房总套数；正实数e，即低电量阈值；正整数D，即观察期阈值。随后N行，每行按以下格式给出一套住房的用电量数据： 
K E1 E2 … EK 
其中K为观察的天数，Ei为第i天的用电量。 
输出格式： 
在一行中输出“可能空置”的比率和“空置”比率的百分比值，其间以一个空格分隔，保留小数点后1位。 
 */
//运行超时

import java.util.Scanner;

public class B1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		double e = Double.parseDouble(str[1]);
		int d = Integer.parseInt(str[2]);
		int vacant = 0;
		int maybeVacant = 0;
		for(int i=0;i<n;i++) {
			int days = sc.nextInt();
			String[] shuju = sc.nextLine().trim().split(" ");
			int va = 0;
			for(int j=0;j<days;j++) {
				if(Double.parseDouble(shuju[j]) < e)
					va++;
			}
			if(va > days/2) {
				if(days > d)
					vacant++;
				else
					maybeVacant++;
			}
		}
		System.out.printf("%.1f%% %.1f%%",maybeVacant*1.0/n*100,vacant*1.0/n*100);
	}
}
