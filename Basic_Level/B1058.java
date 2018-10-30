package Basic_Level;

/*
1058. 选择题(20)
批改多选题是比较麻烦的事情，本题就请你写个程序帮助老师批改多选题，并且指出哪道题错的人最多。
输入格式：
输入在第一行给出两个正整数N（<=1000）和M（<=100），分别是学生人数和多选题的个数。随后M行，每行顺次给出一道题的满分值（不超过5的正整数）、
选项个数（不少于2且不超过5的正整数）、正确选项个数（不超过选项个数的正整数）、所有正确选项。注意每题的选项从小写英文字母a开始顺次排列。
各项间以1个空格分隔。最后N行，每行给出一个学生的答题情况，其每题答案格式为“(选中的选项个数 选项1 ……)”，按题目顺序给出。
注意：题目保证学生的答题情况是合法的，即不存在选中的选项数超过实际选项数的情况。
输出格式：
按照输入的顺序给出每个学生的得分，每个分数占一行。注意判题时只有选择全部正确才能得到该题的分数。最后一行输出错得最多的题目的错误次数和编号
（题目按照输入的顺序从1开始编号）。如果有并列，则按编号递增顺序输出。数字间用空格分隔，行首尾不得有多余空格。如果所有题目都没有人错，
则在最后一行输出“Too simple”。
 */
//运行超时

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);//学生人数
        int m = Integer.parseInt(s[1]);//题目总数
        int[] score = new int[m];//每道题的总分
        int[] wrong = new int[m];//每道题做错人数
        String[] right = new String[m];//每道题的正确答案

        for(int i = 0; i < m; i++) {
            String str = br.readLine();
            score[i] = Integer.parseInt(str.substring(0, 1));
            right[i] = str.substring(4);
        }
        int[] total = new int[n];//学生成绩总分
        for(int i = 0; i < n; i++) {
            String t = br.readLine();
            t = t.substring(t.indexOf('(') + 1, t.lastIndexOf(')'));
            String[] d = t.split("\\)\\s*\\(");
            for(int j = 0; j < d.length;j++) {
                if(d[j].equals(right[j])) {
                    total[i] += score[j];
                }else {
                    wrong[j]++;
                }
            }
            System.out.println(total[i]);
        }
        int maxIndex = 0;
        for(int i = 1; i < m; i++) {
            if(wrong[maxIndex] < wrong[i]) 
                maxIndex = i;
        }
        if(wrong[maxIndex] == 0) {
            System.out.println("Too simple");
        }else {
            System.out.print(wrong[maxIndex]);
            for(int i = 0; i < m; i++) {
                if(wrong[i] == wrong[maxIndex]) {
                    System.out.printf(" %d", i + 1);
                }
            }
        }
    }
}
