package Basic_Level;

/*
1062. 最简分数(20)–PAT乙级真题java实现
一个分数一般写成两个整数相除的形式：N/M，其中M不为0。最简分数是指分子和分母没有公约数的分数表示形式。 
现给定两个不相等的正分数 N1/M1 和 N2/M2，要求你按从小到大的顺序列出它们之间分母为K的最简分数。 
输入格式： 
输入在一行中按N/M的格式给出两个正分数，随后是一个正整数分母K，其间以空格分隔。题目保证给出的所有整数都不超过1000。 
输出格式： 
在一行中按N/M的格式列出两个给定分数之间分母为K的所有最简分数，按从小到大的顺序，其间以1个空格分隔。
行首尾不得有多余空格。题目保证至少有1个输出。 
 */
//未实现,明白gcd

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1062 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] sm = s[0].split("/");
        int n1 = Integer.parseInt(sm[0]), m1 = Integer.parseInt(sm[1]);
        String[] bi = s[1].split("/");
        int n2 = Integer.parseInt(bi[0]), m2 = Integer.parseInt(bi[1]);
        int k = Integer.parseInt(s[2]);
        if(n1 * m2 > n2 * m1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
            temp = m1;
            m1 = m2;
            m2 = temp;
        }
        int num = 1;
        boolean flag = false;
        while(n1 * k >= m1 * num) 
            num++;
        while(n1 * k < m1 * num && m2 * num < n2 * k) {
            if(gcd(k, num) == 1) {
                System.out.printf("%s%d/%d", flag == true ? " " : "", num, k);
                flag = true;
            }
            num++;
        }
    }
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
