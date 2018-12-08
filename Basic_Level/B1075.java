package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class B1075 {

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
		Node2[] nodek = new Node2[len];
		for(Node2 tnode : nodes) {
			if(tnode.address == add) {
				nodek[0] = tnode;
			}
		}
		for(int i=1;i<len;i++) {
			for(Node2 tnode : nodes) {
				if(tnode.address == nodek[i-1].next) {
					nodek[i] = tnode;
				}
			}
		}		
		int t = 0;
		for(Node2 tnode : nodek) {
			if(t!=0 && tnode.data<0) {
				nodes[t] = tnode;
				nodes[t-1].next = nodes[t].address;
				t++;
			}
			else if(t==0 && tnode.data<0) {
				nodes[t++] = tnode;
			}
		}
		for(Node2 tnode : nodek) {
			if(t!=0 && tnode.data>=0 && tnode.data<K) {
				nodes[t] = tnode;
				nodes[t-1].next = nodes[t].address;
				t++;
			}
			else if(t==0 && tnode.data>=0 && tnode.data<K) {
				nodes[t++] = tnode;
			}
		}
		for(Node2 tnode : nodek) {
			if(t!=0 && tnode.data==K) {
				nodes[t] = tnode;
				nodes[t-1].next = nodes[t].address;
				t++;
			}
			else if(t==0 && tnode.data==K) {
				nodes[t++] = tnode;
			}
		}
		for(Node2 tnode : nodek) {
			if(t!=0 && tnode.data>K) {
				nodes[t] = tnode;
				nodes[t-1].next = nodes[t].address;
				t++;
			}
			else if(t==0 && tnode.data>K) {
				nodes[t++] = tnode;
			}
		}
		nodes[--t].next = -1;
		for(Node2 tnode : nodes) {
			System.out.println(tnode);
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