package Basic_Level;

/*
1048 数字加密 （20 分）
本题要求实现一种数字加密方法。首先固定一个加密用正整数 A，对任一正整数 B，将其每 1 位数字与 A 的对应位置上的数字进行以下运算：对奇数位，
对应位的数字相加后对 13 取余——这里用 J 代表 10、Q 代表 11、K 代表 12；对偶数位，用 B 的数字减去 A 的数字，若结果为负数，则再加 10。这里令个位为第 1 位。
输入格式：
输入在一行中依次给出 A 和 B，均为不超过 100 位的正整数，其间以空格分隔。
输出格式：
在一行中输出加密后的结果。
 */

import java.util.Scanner;

public class B1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		sc.close();
        char[] C = new char[A.length > B.length ? A.length : B.length];
        int flag = -1;
        for (int i = A.length, j = B.length, k = C.length; k > 0;) {
            flag++;
            k--;
            i--;
            j--;
            if (flag % 2 == 0) {// odd
                if (i >= 0 && j >= 0) {
                    int t = (A[i] - '0' + B[j] - '0') % 13;
                    if (t == 12)
                        C[flag] = 'K';
                    else if (t == 11)
                        C[flag] = 'Q';
                    else if (t == 10)
                        C[flag] = 'J';
                    else
                        C[flag] = (char) (t + '0');
                } 
                else if (i < 0 && j >= 0)
                    C[flag] = B[j];
                else if (i >= 0 && j < 0)
                    C[flag] = A[i];
            } else {// even
                if (i >= 0 && j >= 0)
                    C[flag] = (char) (((B[j] - A[i] + 10) % 10) + '0');
                else if (i < 0 && j >= 0)
                    C[flag] = B[j];
                else if (i >= 0 && j < 0)
                	C[flag] = (char) (('0' - A[i] + 10) % 10 + '0');
                ;
            }
        }
        for (int i = C.length - 1; i >= 0; i--) {
            System.out.print(C[i]);
        }
        System.out.println();
    }
}
