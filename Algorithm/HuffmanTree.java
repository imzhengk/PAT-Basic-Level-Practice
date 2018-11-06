package Algorithm;
//未完成
import jdk.nashorn.api.tree.BinaryTree;

public class HuffmanTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Huffman implements Comparable<Huffman> {
	BinaryTree tree;
	float weight;
	
	public Huffman(BinaryTree tree,float weight) {
		this.tree = tree;
		this.weight = weight;
	}

	@Override
	public int compareTo(Huffman o) {
		float ow = o.weight;
		return 0;
	}
	
}