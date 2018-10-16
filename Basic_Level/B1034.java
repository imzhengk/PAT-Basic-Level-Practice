package Basic_Level;

/*
1034. 有理数四则运算(20) 
本题要求编写程序，计算2个有理数的和、差、积、商。 
输入格式： 
输入在一行中按照“a1/b1 a2/b2”的格式给出两个分数形式的有理数，其中分子和分母全是整型范围内的整数，负号只可能出现在分子前，分母不为0。 
输出格式： 
分别在4行中按照“有理数1 运算符 有理数2 = 结果”的格式顺序输出2个有理数的和、差、积、商。
注意输出的每个有理数必须是该有理数的最简形式“k a/b”，其中k是整数部分，a/b是最简分数部分；
若为负数，则须加括号；若除法分母为0，则输出“Inf”。题目保证正确的输出中没有超过整型范围的整数。 
 */
//未看，纯抄袭
import java.util.Scanner;

public class B1034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("[\\s/]");
        in.close();
        long a1 = Integer.parseInt(input[0]);
        long b1 = Integer.parseInt(input[1]);
        long a2 = Integer.parseInt(input[2]);
        long b2 = Integer.parseInt(input[3]);

        if (b1 != 0 && b2 != 0) {
            add(a1, b1, a2, b2);
            minus(a1, b1, a2, b2);
            mutilply(a1, b1, a2, b2);
            divide(a1, b1, a2, b2);
        }
    }
    public static void tackle(long a, long b) {
        if (a == 0) {
            System.out.print(0);
            return;
        }
        boolean isMinus = a > 0 ? false : true;
        if (isMinus) {
            System.out.print("(-");
            a = -a;
        }
        long gcd = getGcd(a, b);
        a = a / gcd;
        b = b / gcd;
        if (a % b == 0) {
            System.out.print(a / b);
        } else if (Math.abs(a) > b) {
            System.out.print(a / b + " " + (a % b) + "/" + b);
        } else if (a == b) {
            System.out.print(1);
        } else {
            System.out.print(a + "/" + b);
        }
        if (isMinus) {
            System.out.print(")");
        }
    }
    public static void divide(long a1, long b1, long a2, long b2) {
        tackle(a1, b1);
        System.out.print(" / ");
        tackle(a2, b2);
        System.out.print(" = ");
        if (a2 == 0) {
            System.out.print("Inf");
        } else if (a2 < 0) {
            tackle(-1 * a1 * b2, -1 * a2 * b1);
        } else {
            tackle(a1 * b2, a2 * b1);
        }
    }
    public static void mutilply(long a1, long b1, long a2, long b2) {
        tackle(a1, b1);
        System.out.print(" * ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * a2, b1 * b2);
        System.out.println();
    }
    public static void minus(long a1, long b1, long a2, long b2) {
        tackle(a1, b1);
        System.out.print(" - ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * b2 - a2 * b1, b1 * b2);
        System.out.println();
    }
    public static void add(long a1, long b1, long a2, long b2) {
        tackle(a1, b1);
        System.out.print(" + ");
        tackle(a2, b2);
        System.out.print(" = ");
        tackle(a1 * b2 + a2 * b1, b1 * b2);
        System.out.println();
    }
    public static long getGcd(long a, long b) {
        while (a % b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}
