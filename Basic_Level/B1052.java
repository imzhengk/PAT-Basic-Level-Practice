package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1052 {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("(\\[[^\\]]*\\])");
        String[][] list = new String[3][];
        for(int i=0;i<3;i++) {
            List<String> temp = new ArrayList<String>();
            Matcher m = p.matcher(br.readLine().trim());
            while(m.find()) {
            	temp.add(m.group().substring(1, m.group().length()-1));
            }
            list[i] = (String[]) temp.toArray(new String[temp.size()]);
        }
        int sizea = list[0].length - 1;
        int sizeb = list[1].length - 1;
        int sizec = list[2].length - 1;
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
        	String[] str = br.readLine().split("\\s+");
        	int[] k = new int[5];
        	for(int j=0;j<5;j++) {
        		k[j] = Integer.parseInt(str[j]) - 1;
        	}
        	boolean flag = k[0]>sizea || k[1]>sizeb || k[2]>sizec || k[3]>sizeb || k[4]>sizea || k[0]<0 || k[1]<0 || k[2]<0 || k[3]<0 || k[4]<0;
        	if(flag) {
        		System.out.println("Are you kidding me? @\\/@");
        		continue;
        	}
        	else {
        		System.out.println(list[0][k[0]] + "(" + list[1][k[1]] + list[2][k[2]] +  list[1][k[3]] + ")" + list[0][k[4]]);
        	}
        }
    }
}
