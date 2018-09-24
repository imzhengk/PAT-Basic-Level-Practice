
/*
1015 德才论 （25 分）
宋代史学家司马光在《资治通鉴》中有一段著名的“德才论”：“是故才德全尽谓之圣人，才德兼亡谓之愚人，德胜才谓之君子，才胜德谓之小人。
凡取人之术，苟不得圣人，君子而与之，与其得小人，不若得愚人。”现给出一批考生的德才分数，请根据司马光的理论给出录取排名。
输入格式：
输入第一行给出 3 个正整数，分别为：N（≤10 5），即考生总数；L（≥60），为录取最低分数线，即德分和才分均不低于 L 的考生才有资格被考虑录取；
H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序；
才分不到但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；
德才分均低于 H，但是德分不低于才分的考生属于“才德兼亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；
其他达到最低线 L 的考生也按总分排序，但排在第三类考生之后。
随后 N 行，每行给出一位考生的信息，包括：准考证号 德分 才分，其中准考证号为 8 位整数，德才分为区间 [0, 100] 内的整数。数字间以空格分隔。
输出格式：
输出第一行首先给出达到最低分数线的考生人数 M，随后 M 行，每行按照输入格式输出一位考生的信息，考生按输入中说明的规则从高到低排序。
当某类考生中有多人总分相同时，按其德分降序排列；若德分也并列，则按准考证号的升序输出。
 */
//排序用的是Comparable接口，待看
//PAT运行超时
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class B1015 {

	public static void main(String[] args) throws Exception {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] da = br.readLine().split(" ");
        int N = Integer.parseInt(da[0]);
        int L = Integer.parseInt(da[1]);
        int H = Integer.parseInt(da[2]);
        List<Person> PList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] cur = line.split(" ");
            int id = Integer.parseInt(cur[0]);
            int mora = Integer.parseInt(cur[1]);
            int talent = Integer.parseInt(cur[2]);
            Person Person = new Person(id, mora, talent,H);
            if (mora >= L && talent >= L) 
                PList.add(Person);
        }
        System.out.println(PList.size());
        Collections.sort(PList);
        for (Person Person : PList) 
            Person.printInfo(); 

	}
	public static class Person implements Comparable<Person>{
		int id;
		int mora;
		int talent;
		int type;
		int score;
		public Person(int id,int mora,int talent,int h) {
			this.id = id;
			this.mora = mora;
			this.talent = talent;
			this.score = this.mora + this.talent;
			if(mora >= h && talent >=h)
				type = 1;
			else if(mora >= h && talent < h)
				type = 2;
			else if(mora < h && talent < h && mora >= talent)
				type = 3;
			else
				type = 4;
		}
		public void printInfo() {
			System.out.println(this.id + " " + this.mora + " " + this.talent); 
		}
		public int compareTo(Person p) {
            if (this.type == p.type) {
                if (this.score == p.score) {
                    if (this.mora == p.mora) 
                        return (this.id - p.id);
                    return (p.mora - this.mora);
                }
                return (p.score - this.score);
            }
            return (this.type - p.type);
        } 
	}

}
