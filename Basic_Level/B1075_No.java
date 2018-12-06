package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
//B1025的内容未改
public class B1075_No {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int add = Integer.parseInt(str[0]);
		int len = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);		
		Node2[] nodes = new Node2[len];
		for(int i=0;i<len;i++) {
			String[] temp = br.readLine().split("\\s+");
			int first = Integer.parseInt(temp[0]);
			int data = Integer.parseInt(temp[1]);
			int next = Integer.parseInt(temp[2]);			
			nodes[i] = new Node2(first,data,next);
		}
		Node2[] nodek = new Node2[K+1];
		nodek[0] = new Node2(add,0,add);
		for(int t=0;t<len/K;t++) {
			for(int i=1;i<=K;i++) {
				for(Node2 tnode : nodes) {
					if(tnode.address == nodek[i-1].next) {
						nodek[i] = tnode;
					}
				}
			}
			nodek[0].next = nodek[K].next;
			nodek[0].address = nodek[K].next;
			for(int i=K;i>0;i--) {
				nodek[i].next = nodek[i-1].address;
				System.out.println(nodek[i]);
			}
		}
		for(int t=0;t<len%K;t++) {
			for(Node2 tnode : nodes) {
				if(tnode.address == nodek[0].next) {
					nodek[0] = tnode;
					System.out.println(nodek[0]);
				}
			}
		}
	}		
}

class Node2 {
    int address;
    int data;
    int next;
    Node2(int address, int data, int next) {
        this.address = address;
        this.data = data;
        this.next = next;
    }
    
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("00000");
    	if(next==-1) {
    		return df.format(address) + " " + data + " " + next;
    	}
    	else {
    		return df.format(address) + " " + data + " " + df.format(next);
    	}
    }
}