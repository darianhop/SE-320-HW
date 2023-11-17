package pack_3;

import java.util.*;
import java.io.*;

public class Tree_Set_Holder {
	
	public static void main(String[] args) throws Exception
    {
		//Create tree set
		Set<String> tree_set_1 = new TreeSet<>();
		
		//Create file parameter
		File text_file = new File(
	            "C:\\Tree_set_SE_320_HW\\tree_set_text_file.txt");
		
		//Create Buffered Reader
		BufferedReader br
        = new BufferedReader(new FileReader(text_file));
		
		//Creating String variable
		String word;
		
		//Create method for reading words from text file
		//then storing those words in the tree set
		while ((word = br.readLine()) != null) {
			
			tree_set_1.add(word);
			
		}
		
		//Print out text_file from tree set
		System.out.println(tree_set_1);
		
    }
	
}
