package Basic_Level;

/*
1052 卖个萌 （20 分）
萌萌哒表情符号通常由“手”、“眼”、“口”三个主要部分组成。简单起见，我们假设一个表情符号是按下列格式输出的：
[左手]([左眼][口][右眼])[右手]
现给出可选用的符号集合，请你按用户的要求输出表情。
输入格式：
输入首先在前三行顺序对应给出手、眼、口的可选符号集。每个符号括在一对方括号 []内。题目保证每个集合都至少有一个符号，并不超过 10 个符号；每个符号包含 1 到 4 个非空字符。
之后一行给出一个正整数 K，为用户请求的个数。随后 K 行，每行给出一个用户的符号选择，
顺序为左手、左眼、口、右眼、右手——这里只给出符号在相应集合中的序号（从 1 开始），数字间以空格分隔。
输出格式：
对每个用户请求，在一行中输出生成的表情。若用户选择的序号不存在，则输出 Are you kidding me? @\/@。
 */
//答案错误

import java.util.Scanner;

public class B1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        String h = sc.nextLine().trim();
        String[] hands = h.substring(h.indexOf("[") + 1, h.lastIndexOf(']')).split("\\]\\s*\\[");
        String e = sc.nextLine().trim();
        String[] eyes = e.substring(h.indexOf("[") + 1, e.lastIndexOf(']')).split("\\]\\s*\\[");
        String m = sc.nextLine().trim();
        String[] mouths = m.substring(h.indexOf("[") + 1, m.lastIndexOf(']')).split("\\]\\s*\\[");

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] in = sc.nextLine().split("\\s+");
            String temp = "";
            boolean flag = true;
            if (Integer.parseInt(in[0]) <= hands.length) {
                temp = temp + hands[Integer.parseInt(in[0]) - 1] + "(";
            } else {
                System.out.println("Are you kidding me? @\\/@");
                flag = false;
                continue;
            }

            if (Integer.parseInt(in[1]) <= eyes.length) {
                temp = temp + eyes[Integer.parseInt(in[1]) - 1];
            } else {
                System.out.println("Are you kidding me? @\\/@");
                flag = false;
                continue;
            }

            if (Integer.parseInt(in[2]) <= mouths.length) {
                temp = temp + mouths[Integer.parseInt(in[2]) - 1];
            } else {
                System.out.println("Are you kidding me? @\\/@");
                flag = false;
                continue;
            }

            if (Integer.parseInt(in[3]) <= eyes.length) {
                temp = temp + eyes[Integer.parseInt(in[3]) - 1];
            } else {
                System.out.println("Are you kidding me? @\\/@");
                flag = false;
                continue;
            }

            if (Integer.parseInt(in[4]) <= hands.length) {
                temp = temp + ")" + hands[Integer.parseInt(in[4]) - 1];
            } else {
                System.out.println("Are you kidding me? @\\/@");
                flag = false;
                continue;
            }
            if (flag) {
                System.out.println(temp);
            }

        }

    }
}
