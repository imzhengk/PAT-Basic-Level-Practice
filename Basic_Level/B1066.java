package Basic_Level;

/*
1066. 图像过滤(15)–PAT乙级真题java实现
图像过滤是把图像中不重要的像素都染成背景色，使得重要部分被凸显出来。现给定一幅黑白图像，要求你将灰度值位于某指定区间内的所有像素颜色都用一种指定的颜色替换。 
输入格式： 
输入在第一行给出一幅图像的分辨率，即两个正整数M和N（0 < M, N <= 500），另外是待过滤的灰度值区间端点A和B（0 <= A < B <= 255）、
以及指定的替换灰度值。随后M行，每行给出N个像素点的灰度值，其间以空格分隔。所有灰度值都在[0, 255]区间内。 
输出格式： 
输出按要求过滤后的图像。即输出M行，每行N个像素灰度值，每个灰度值占3位（例如黑色要显示为000），其间以一个空格分隔。行首尾不得有多余空格。 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class B1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		int a = Integer.parseInt(str[2]);
		int b = Integer.parseInt(str[3]);
		int ti = Integer.parseInt(str[4]);
		int[][] pic = new int[m][n];
	    DecimalFormat df = new DecimalFormat("000");  
		for(int i=0;i<m;i++) {
			StringBuffer row = new StringBuffer();
			for(int j=0;j<n;j++) {
				pic[i][j] = sc.nextInt();
				if(pic[i][j]>=a && pic[i][j]<=b) {
					pic[i][j] = ti;
				}
				row.append(df.format(pic[i][j]) + " ");
			}
			System.out.println(row.toString().trim());
			sc.nextLine();
		}
		sc.close();
	}
}
