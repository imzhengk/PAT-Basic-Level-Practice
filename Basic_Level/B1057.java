package Basic_Level;

/*
1057.数零壹(20)–PAT乙级真题java实现
给定一串长度不超过10^5的字符串，本题要求你将其中所有英文字母的序号（字母a-z对应序号1-26，不分大小写）相加，得到整数N，然后再分析一下N的二进制表示中有多少0、多少1。
例如给定字符串“PAT (Basic)”，其字母序号之和为：16+1+20+2+1+19+9+3=71，而71的二进制是1000111，即有3个0、4个1。
输入格式：
输入在一行中给出长度不超过105、以回车结束的字符串。
输出格式：
在一行中先后输出0的个数和1的个数，其间以空格分隔。
 */

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();

        int sum = 0;
        char[] chs = s.toCharArray();
        for(int i = 0; i < chs.length; i++) {
            if(chs[i] >= 'a' && chs[i] <= 'z') {
                sum += chs[i] - 'a' + 1;
            }
        }
        int one = 0, zero = 0;
        while(sum != 0) {
            if(sum % 2 == 0)
                zero++;
            else
                one++;
            sum = sum / 2;
        }
        System.out.println(zero + " " + one);
    }
}

*/

import java.util.Scanner;

public class B1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.nextLine().toLowerCase().toCharArray();
		sc.close();
		int sum = 0;
		for(char c:ch) {
			if(c >= 'a' && c <= 'z')
				sum = sum + (int)(c-'a') + 1;
		}
		char[] result = Integer.toBinaryString(sum).toCharArray();
		int num0 = 0,num1 = 0;
		for(char c:result) {
			if(c=='0')  num0++;
			if(c=='1')  num1++;
		}
		System.out.println(num0 + " " + num1);
	}
}
