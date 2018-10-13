/*
1031. 查验身份证(15) 
一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下： 
首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}； 
然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值： 
Z：0 1 2 3 4 5 6 7 8 9 10
M：1 0 X 9 8 7 6 5 4 3 2 
现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。 
输入格式： 
输入第一行给出正整数N（<= 100）是输入的身份证号码的个数。随后N行， 
每行给出1个18位身份证号码。 
输出格式： 
按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后1位校验码计算准确。
如果所有号码都正常，则输出“All passed”。
 */
import java.util.Scanner;

public class B1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int temp = 0;
		for(int i=0;i<num;i++) {
			String str = sc.nextLine();
			if(Judge(str))
				temp++;			
		}
		sc.close();
		if(temp==num)
			System.out.println("All passed");
	}
	public static boolean Judge(String str) {
		int check = 0;
		int[] weights = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		char[] digs = str.toCharArray();
		Boolean flag = false;
		for(int i=0;i<17;i++) {
			if(digs[i] >= '0' && digs[i] <='9') {
				int dig = (int)(digs[i] - '0');
				check = check + dig*weights[i];
				if(i==16)
					flag = true;
			}
			else {
				flag = false;
				System.out.println(str);
				break;
			}
		}
		check = check % 11;
		if(flag) {
			char match = Match(check);
			if(match == digs[17])
				return flag;
			else {
				flag = false;
				System.out.println(str);
				return flag;
			}
		}
		else
			return flag;
	}
	public static char Match(int check) {
		int[] z = { 0,1,2,3,4,5,6,7,8,9,10 };
		char[] m = { '1','0','X','9','8','7','6','5','4','3','2' };
		for(int i=0;i<z.length;i++) {
			if(check == z[i]) {
				return m[i];
			}			
		}
		return 0;
	}

}
