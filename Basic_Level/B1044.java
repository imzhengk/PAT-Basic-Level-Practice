package Basic_Level;

/*
1044. 火星数字(20) 
火星人是以13进制计数的：地球人的0被火星人称为tret。地球人数字1到12的火星文分别为：jan, feb, mar, apr, may, jun, jly, aug, sep, oct, nov, dec。
火星人将进位以后的12个高位数字分别称为：tam, hel, maa, huh, tou, kes, hei, elo, syy, lok, mer, jou。
例如地球人的数字“29”翻译成火星文就是“hel mar”；而火星文“elo nov”对应地球数字“115”。为了方便交流，请你编写程序实现地球和火星数字之间的互译。 
输入格式： 
输入第一行给出一个正整数N（<100），随后N行，每行给出一个[0, 169)区间内的数字 —— 或者是地球文，或者是火星文。 
输出格式： 
对应输入的每一行，在一行中输出翻译后的另一种语言的数字。 
 */

import java.util.Scanner;

public class B1044 {
	static String[] basic = { "tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec" };
    static String[] high = { "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou" };
	
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = Integer.parseInt(sc.nextLine());
	    for(int i=0;i<n;i++) {
	    	String num = sc.nextLine();
	    	if(num.matches("[0-9]{1,}"))
	    		toMarsLang(Integer.parseInt(num));
	    	else
	    		toEarthLang(num);
	    }
	    sc.close();
	}
    
	public static void toEarthLang(String mar) {
		String[] mars = mar.split(" ");
        if (mars.length == 1) {
            for (int i = 0; i < basic.length; i++) {
                if (mars[0].equals(basic[i]))
                    System.out.println(i);
            }
            for (int i = 0; i < high.length; i++) {
                if (mars[0].equals(high[i]))
                    System.out.println((i+1) * 13);
            }
        }
        else {
        	int total = 0;
            for (int i = 0; i < high.length; i++) {
                if (mars[0].equals(high[i]))
                    total = (i+1) * 13;
            }
            for (int i = 0; i < basic.length; i++) {
                if (mars[1].equals(basic[i]))
                    total = total + i;
            }
            System.out.println(total);
        }        
	}
	
	public static void toMarsLang(int earth) {
		if(earth < 13)
			System.out.println(basic[earth]);
		else if(earth % 13 == 0) 
			System.out.println(high[earth/13 - 1]);
		else
			System.out.println(high[earth/13 - 1] + " " + basic[earth%13]);
	}
}
