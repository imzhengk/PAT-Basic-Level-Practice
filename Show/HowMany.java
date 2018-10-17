package Show;

import java.io.*;

public class HowMany {

	public static void main(String[] args) {
		int num = 0;
	    File dir = new File("src/Basic_Level/");
	    FileAccept fileAccept = new FileAccept();
	    fileAccept.setExtendName("java");
	    String [] fileName = dir.list(fileAccept);
	    for(String name:fileName) {
	          num++;
	    }
	    System.out.println(num);

	}

}
