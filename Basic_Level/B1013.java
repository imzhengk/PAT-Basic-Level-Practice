package Basic_Level;
/*
1013 数素数 （20 分）
令 Pi表示第 i 个素数。现任给两个正整数 M≤N≤10 4请输出 PM到 PN的所有素数。
输入格式：
输入在一行中给出 M 和 N，其间以空格分隔。
输出格式：
输出从 PM到 PN的所有素数，每 10 个数字占 1 行，其间以空格分隔，但行末不得有多余空格。
*/
import java.util.Scanner;
 
public class B1013 {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int begin = in.nextInt();
        int end = in.nextInt();
        in.close();
        int[] array = new int[end];
        int index = 0;
        int i = 2;
        while (index < end) {
            if (Isprime(i)) {
                array[index] = i;
                index++;
            }
            i++;
        }
        int ten = 0;
        for (int j = (begin - 1); j < end; j++) {
            System.out.print(array[j]);
            ten++;
            if (ten % 10 == 0) {
                System.out.println();
                continue;
            }
            if (j != end - 1) {
                System.out.print(" ");
            }
        }
    }
         
    public static boolean Isprime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
             
            for (int i = 3; i <= (int)Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
 
    }
}
