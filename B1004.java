/*
1004 成绩排名 （20 分）
读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
输入格式：
每个测试输入包含 1 个测试用例，格式为
第 1 行：正整数 n
第 2 行：第 1 个学生的姓名 学号 成绩
  ... ... ...
第 n+1 行：第 n 个学生的姓名 学号 成绩
其中姓名和学号均为不超过 10 个字符的字符串，成绩为 0 到 100 之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
输出格式：
对每个测试用例输出 2 行，第 1 行是成绩最高学生的姓名和学号，第 2 行是成绩最低学生的姓名和学号，字符串间有 1 空格。
*/
import java.util.Scanner;

class Student{
    String name;
    String ID;
    int score;
}
public class B1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stu = new Student[n];
        int max = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
            stu[i].name = sc.next();
            stu[i].ID = sc.next();
            stu[i].score = sc.nextInt();
            max = max > stu[i].score ? max:stu[i].score; 
            min = min < stu[i].score ? min:stu[i].score; 
        }
        for (int i = 0; i < n; i++) {
            if (stu[i].score == max) {
                System.out.println(stu[i].name + " " + stu[i].ID);
            } 
        }
        for (int i = 0; i < n; i++) {
            if (stu[i].score == min) {
                System.out.println(stu[i].name + " " + stu[i].ID);
            } 
        }

    }
}
