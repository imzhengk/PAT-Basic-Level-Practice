package Basic_Level;
/*
1012 数字分类 （20 分）
给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
A1 = 能被 5 整除的数字中所有偶数的和；
A2 = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1−n2+n3−n4 ⋯；
A3 = 被 5 除后余 2 的数字的个数；
A4 = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
A5 = 被 5 除后余 4 的数字中最大数字。
输入格式：
每个输入包含 1 个测试用例。每个测试用例先给出一个正整数 N，随后给出 N 个待分类的正整数。数字间以空格分隔。
输出格式：
对给定的 N 个正整数，按题目要求计算 A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
若其中某一类数字不存在，则在相应位置输出 N。
!!!注意结果为零和不存在是两种情况!!!
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class B1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++) {
			num[i] = sc.nextInt();
		}
		String[] a = new String[5];
		A1 a1 = new A1();
		a[0] = a1.getResult(n, num);
		A2 a2 = new A2();
		a[1] = a2.getResult(n, num);
		A3 a3 = new A3();
		a[2] = a3.getResult(n, num);
		A4 a4 = new A4();
		a[3] = a4.getResult(n, num);
		A5 a5 = new A5();
		a[4] = a5.getResult(n, num);
		for(int i=0;i<5;i++) {
			if(a[i].equals("0.00")) {
				a[i] = "N";
			}
		}
		String result = a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4];
		System.out.print(result);
	}
}

class A1{
	String getResult(int n,int[] num) {
		int flag = 0;
		int sum = 0;
		for(int i=0;i<n;i++) {
			if(num[i]%5 == 0) {
				if(num[i]%2 == 0){
					sum = sum + num[i];
					flag = flag + 1;
				}
			}
		}
		if(flag == 0) {
			return "0.00";
		}
		else	return String.valueOf(sum);
	}
}

class A2{
	String getResult(int n,int[] num) {
		int sum = 0;
		int flag = 1;
		for(int i=0;i<n;i++) {
			if(num[i]%5 == 1) {
				if(flag%2 == 1){
					sum = sum + num[i];
					flag = flag + 1;
				}
				else if(flag%2 == 0) {
					sum = sum - num[i];
					flag = flag + 1;
				}
			}
		}
		if(flag == 1) {
			return "0.00";
		}
		else	return String.valueOf(sum);
	}
}

class A3{
	String getResult(int n,int[] num) {
		int sum = 0;
		int flag = 0;
		for(int i=0;i<n;i++) {
			if(num[i]%5 == 2) {
					sum = sum + 1;
					flag = flag + 1;
			}
		}
		if(flag == 0) {
			return "0.00";
		}
		else	return String.valueOf(sum);
	}
}

class A4{
	String getResult(int n,int[] num) {
		double sum = 0;
		int flag = 0;
		for(int i=0;i<n;i++) {
			if(num[i]%5 == 3) {
					sum = sum + num[i];
					flag = flag + 1;
			}
		}
		if(sum != 0) {
			DecimalFormat fmt = new DecimalFormat("0.0");
			return fmt.format(sum/flag);
		}
		else	return "0.00";
	}
}

class A5{
	String getResult(int n,int[] num) {
		int sum = 0;
		int flag = 0;
		for(int i=0;i<n;i++) {
			if(num[i]%5 == 4) {
				if(sum < num[i]){
					sum = num[i];
					flag = flag + 1;
				}
			}
		}
		if(flag == 0) {
			return "0.00";
		}
		else	return String.valueOf(sum);
	}
}