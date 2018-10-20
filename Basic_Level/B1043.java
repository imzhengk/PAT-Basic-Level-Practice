package Basic_Level;

/*
1043. 输出PATest(20) 
给定一个长度不超过10000的、仅由英文字母构成的字符串。请将字符重新调整顺序， 按“PATestPATest….”这样的顺序输出，并忽略其它字符。
当然，六种字符的个数不一定是一样多的，若某种字符已经输出完，则余下的字符仍按PATest的顺序打印，直到所有字符都被输出。 
输入格式： 
输入在一行中给出一个长度不超过10000的、仅由英文字母构成的非空字符串。 
输出格式： 
在一行中按题目要求输出排序后的字符串。题目保证输出非空。 
 */

import java.util.Scanner;

public class B1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chars = sc.nextLine().toCharArray();
		sc.close();
		int P = 0, A = 0, T = 0, e = 0, s = 0, t = 0;
        for (char c : chars) {
            if (c == 'P')
                P++;
            if (c == 'A')
                A++;
            if (c == 'T')
                T++;
            if (c == 'e')
                e++;
            if (c == 's')
                s++;
            if (c == 't')
                t++;
        }
        while (P > 0 || A > 0 || T > 0 || e > 0 || s > 0 || t > 0) {
            if (P > 0) {
                System.out.print("P");
                P--;
            }
            if (A > 0) {
                System.out.print("A");
                A--;
            }
            if (T > 0) {
                System.out.print("T");
                T--;
            }
            if (e > 0) {
                System.out.print("e");
                e--;
            }
            if (s > 0) {
                System.out.print("s");
                s--;
            }
            if (t > 0) {
                System.out.print("t");
                t--;
            }
        }
	}
}
