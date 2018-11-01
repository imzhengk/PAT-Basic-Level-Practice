package Basic_Level;

/*
1059.C语言竞赛(20)
C语言竞赛是浙江大学计算机学院主持的一个欢乐的竞赛。既然竞赛主旨是为了好玩，颁奖规则也就制定得很滑稽： 
0.冠军将赢得一份“神秘大奖”（比如很巨大的一本学生研究论文集……）。 
1.排名为素数的学生将赢得最好的奖品 —— 小黄人玩偶！ 
2.其他人将得到巧克力。 
给定比赛的最终排名以及一系列参赛者的ID，你要给出这些参赛者应该获得的奖品。 
输入格式： 
输入第一行给出一个正整数N（<=10000），是参赛者人数。随后N行给出最终排名，每行按排名顺序给出一位参赛者的ID（4位数字组成）。接下来给出一个正整数K以及K个需要查询的ID。 
输出格式： 
对每个要查询的ID，在一行中输出“ID: 奖品”，其中奖品或者是“Mystery Award”（神秘大奖）、或者是“Minion”（小黄人）、或者是“Chocolate”（巧克力）。
如果所查ID根本不在排名里，打印“Are you kidding?”（耍我呢？）。如果该ID已经查过了（即奖品已经领过了），打印“ID: Checked”（不能多吃多占）。 
 */
//未实现

import java.io.IOException;
import java.util.Scanner;

public class B1059 {
    public static void main(String[] args) throws IOException{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rank = new int[10000];
        boolean[] checked = new boolean[10000];
        for(int i = 0; i < N; i++) {
            rank[sc.nextInt()] = i + 1;
        }
        int K = sc.nextInt();
        for(int i = 0; i < K; i++) {
            int id = sc.nextInt();
            System.out.printf("%04d: ", id);
            if(rank[id] == 0) {
                System.out.println("Are you kidding?");
                continue;
            }
            if(!checked[id]) {
                checked[id] = true;
            } else {
                System.out.println("Checked");
                continue;
            }
            if(rank[id] == 1) {
                System.out.println("Mystery Award");
            }else if(isprime(rank[id])) {
                System.out.println("Minion");
            }else {
                System.out.println("Chocolate");
            }
        }

    }
    public static boolean isprime(int a) {
        if(a <= 1) return false;
        int Sqrt = (int) Math.sqrt(a);
        for(int i = 2; i <= Sqrt; i++) {
            if(a % i == 0)
                return false;
        }
        return true;
    }
}
