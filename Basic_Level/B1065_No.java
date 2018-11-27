package Basic_Level;

/*
1065.单身狗(25)–PAT乙级真题java实现
“单身狗”是中文对于单身人士的一种爱称。本题请你从上万人的大型派对中找出落单的客人，以便给予特殊关爱。 
输入格式： 
输入第一行给出一个正整数N（<=50000），是已知夫妻/伴侣的对数；随后N行，每行给出一对夫妻/伴侣——为方便起见，每人对应一个ID号，为5位数字（从00000到99999），ID间以空格分隔；之后给出一个正整数M（<=10000），为参加派对的总人数；随后一行给出这M位客人的ID，以空格分隔。题目保证无人重婚或脚踩两条船。 
输出格式： 
首先第一行输出落单客人的总人数；随后第二行按ID递增顺序列出落单的客人。ID间用1个空格分隔，行的首尾不得有多余空格。 
 */
/*
分析： 
设立数组couples[i] = j表示i的对象是j。一开始先设置为都是-1。设立数组appear表示某人的对象是否来到了派对上。接收数据的时候，对于每一对wife和husband，
将couple的husband设置为wife，wife设置为husband，表示他俩是一对。对于每一个需要判断的人，将其存储在guest数组里面，
如果它不是单身的（也就是如果它的couple[guest[i]] != -1）那么就将它对象的appear设置为1，表示他对象的对象（也就是他自己）来到了派对。
这样所有appear不为1的人，对象是没有来到派对的。
 */
//运行超时

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class B1065_No {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int couples[] = new int[100000];
        int appear[] = new int[100000];
        for(int i = 0; i < 100000; i++) {
            couples[i] = -1;
            appear[i] = -1;
        }

        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int wife = Integer.parseInt(s[0]);
            int husband = Integer.parseInt(s[1]);
            couples[wife] = husband;
            couples[husband] = wife;
        }

        int M = Integer.parseInt(br.readLine());
        String[] guest = br.readLine().split(" ");
        int minus = 0;
        for(int i = 0; i < M; i++) {
            int g = Integer.parseInt(guest[i]);
            if(couples[g] != -1)
                appear[couples[g]] = 1;
            if(couples[g] != -1 && appear[couples[g]] == 1 && appear[g] == 1) {
                minus += 2;
            }
        }

        Arrays.sort(guest);

        boolean flag = false;

        System.out.println(guest.length - minus);
        for(int i = 0; i < guest.length;i++) {
            int g = Integer.parseInt(guest[i]);
            if(appear[g] != 1) {
                if(flag) {
                    System.out.print(" " + guest[i]);
                }else {
                    System.out.print(guest[i]);
                    flag = true;
                }
            }
        }
    }
}
