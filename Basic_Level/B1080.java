package Basic_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B1080 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s+");
		int P = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int N = Integer.parseInt(str[2]);
		Map<String,Integer> mapGp = new HashMap<String,Integer>();
		Map<String,Integer> mapGmid = new HashMap<String,Integer>();
		Map<String,Integer> mapGfin = new HashMap<String,Integer>();
		for(int i=0;i<P;i++) {
			String[] temp = br.readLine().split("\\s+");
			int tmp = Integer.parseInt(temp[1]);
			if(tmp>=200) {
				mapGp.put(temp[0], tmp);
			}
		}
		for(int i=0;i<M;i++) {
			String[] temp = br.readLine().split("\\s+");
			int tmp = Integer.parseInt(temp[1]);
			mapGmid.put(temp[0], tmp);
		}
		for(int i=0;i<N;i++) {
			String[] temp = br.readLine().split("\\s+");
			int tmp = Integer.parseInt(temp[1]);
			mapGfin.put(temp[0], tmp);
		}
		List<Stu> list = new ArrayList<Stu>();
		for(String nump : mapGp.keySet()) {
			int Gp = mapGp.get(nump);
			int Gmid = -1;
			int Gfin = -1;
			for(String numm : mapGmid.keySet()) {
				if(nump.equals(numm)) {
					Gmid = mapGmid.get(numm);
					break;
				}
			}
			for(String numf : mapGfin.keySet()) {
				if(nump.equals(numf)) {
					Gfin = mapGfin.get(numf);
					break;
				}
			}
			if(Gmid == -1 && Gfin == -1) {
				continue;
			}
			else {
				int G = -1;
				if(Gmid > Gfin) {
					G = (int) Math.round(Gmid*0.4 + Gfin*0.6);
				}
				else {
					G = Gfin;
				}
				if(G<60) {
					continue;
				}
				else {
					Stu temp = new Stu(nump,Gp,Gmid,Gfin,G);
					list.add(temp);
				}
			}
		}
		Collections.sort(list);
		for(Stu stu : list) {
			System.out.println(stu.toString());
		}
	}
}
class Stu implements Comparable<Stu>{
	String stunum;
	int Gp, Gmid, Gfin, G;
	
	public Stu(String stunum,int Gp,int Gmid,int Gfin,int G) {
		this.stunum = stunum;
		this.Gp = Gp;
		this.Gmid = Gmid;
		this.Gfin = Gfin;
		this.G = G;
	}
	@Override
	public String toString() {
		return stunum + " " + Gp + " " + Gmid + " " + Gfin + " " + G;		
	}
	@Override
	public int compareTo(Stu o) {
		if(this.G == o.G) 
			return this.stunum.compareTo(o.stunum);
		return o.G - this.G;
	}	
}
