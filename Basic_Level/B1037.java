package Basic_Level;

/*
1037. 在霍格沃茨找零钱（20） 
如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 —— 就如海格告诉哈利的：“十七个银西可(Sickle)兑一个加隆(Galleon)，
二十九个纳特(Knut)兑一个西可，很容易。”现在，给定哈利应付的价钱P和他实付的钱A，你的任务是写一个程序来计算他应该被找的零钱。 
输入格式： 
输入在1行中分别给出P和A，格式为“Galleon.Sickle.Knut”，其间用1个空格分隔。这里Galleon是[0, 10^7]区间内的整数，
Sickle是[0, 17)区间内的整数，Knut是[0, 29)区间内的整数。 
输出格式： 
在一行中用与输入同样的格式输出哈利应该被找的零钱。如果他没带够钱，那么输出的应该是负数。 
 */
//正则表达式中用[.]作为分隔符

import java.util.Scanner;

public class B1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		sc.close();
		int p = Conver(str[0]);
		int a = Conver(str[1]);
		Change(a-p);
	}
	static int Conver(String str) {
		String[] money = str.split("[.]");
		int Galleon = Integer.parseInt(money[0]);
		int Sickle = Integer.parseInt(money[1]);
		int Knut = Integer.parseInt(money[2]);
		Knut = Galleon*17*29 + Sickle*29 +Knut;
		return Knut;
	}
	static void Change(int minus) {
		if(minus<0) {
			minus = Math.abs(minus);
			System.out.print("-");
		}
		int Galleon = minus / (17*29);
		int Sickle = minus % (17*29) / 29;
		int Kunt = minus % (17*29) % 29;
		System.out.print(Galleon + "." + Sickle + "." + Kunt);
	}

}
