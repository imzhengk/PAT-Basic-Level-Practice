package Basic_Level;

/*
1072. 开学寄语(20)–PAT乙级真题java实现
下图是上海某校的新学期开学寄语：天将降大任于斯人也，必先删其微博，卸其QQ，封其电脑，夺其手机，收其ipad，断其wifi，使其百无聊赖，然后，净面、理发、整衣，然后思过、读书、锻炼、明智、开悟、精进。而后必成大器也！ 
本题要求你写个程序帮助这所学校的老师检查所有学生的物品，以助其成大器。 
输入格式： 
输入第一行给出两个正整数N（<= 1000）和M（<= 6），分别是学生人数和需要被查缴的物品种类数。第二行给出M个需要被查缴的物品编号，其中编号为4位数字。随后N行，每行给出一位学生的姓名缩写（由1-4个大写英文字母组成）、个人物品数量K（0 <= K <= 10）、以及K个物品的编号。 
输出格式： 
顺次检查每个学生携带的物品，如果有需要被查缴的物品存在，则按以下格式输出该生的信息和其需要被查缴的物品的信息（注意行末不得有多余空格）： 
姓名缩写: 物品编号1 物品编号2 …… 
最后一行输出存在问题的学生的总人数和被查缴物品的总数。 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1072 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        String[] thing = br.readLine().split(" ");
        int stuTol = 0, thTol = 0;
        for(int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            boolean flag = false;
            for(int j = 2; j < temp.length; j++) {
                for(int k = 0; k < M; k++) {
                    if(temp[j].equals(thing[k])) {
                        thTol++;
                        if(flag) {
                            System.out.print(" " + temp[j]);
                        }else {
                            System.out.print(temp[0] + ": " + temp[j]);
                        }
                        flag = true;
                    }
                }
            }
            if(flag) {
                stuTol++;
                System.out.println();
            }
        }
        System.out.println(stuTol + " " + thTol);
    }
}
