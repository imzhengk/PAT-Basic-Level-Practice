package Basic_Level;

/*
1069. 微博转发抽奖(20)–PAT乙级真题java实现
小明PAT考了满分，高兴之余决定发起微博转发抽奖活动，从转发的网友中按顺序每隔N个人就发出一个红包。请你编写程序帮助他确定中奖名单。 
输入格式： 
输入第一行给出三个正整数M（<= 1000）、N和S，分别是转发的总量、小明决定的中奖间隔、以及第一位中奖者的序号（编号从1开始）。随后M行，顺序给出转发微博的网友的昵称（不超过20个字符、不包含空格回车的非空字符串）。 
注意：可能有人转发多次，但不能中奖多次。所以如果处于当前中奖位置的网友已经中过奖，则跳过他顺次取下一位。 
输出格式： 
按照输入的顺序输出中奖名单，每个昵称占一行。如果没有人中奖，则输出“Keep going…”。 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class B1069 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int total = Integer.parseInt(s[0]);
        int interval = Integer.parseInt(s[1]);
        int prize = Integer.parseInt(s[2]);
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for(int i = 1; i <= total; i++) {
            String user = br.readLine();
            if(list.contains(user)) 
                prize++;
            if(i == prize) {
                System.out.println(user);
                list.add(user);
                flag = true;
                prize += interval;
            }
        }
        if(!flag)
            System.out.println("Keep going...");

    }
}

