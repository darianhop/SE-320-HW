package pack_3;

import java.io.*; 
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linked_Hash_Sets {

	 @SuppressWarnings("unchecked")
	public static void main(String[] args) 
	    { 
		 //Creating all linked hash sets and their clones 
		 LinkedHashSet<String> hash_set_1 = new LinkedHashSet<String>();
		 LinkedHashSet<String> hash_set_2 = new LinkedHashSet<String>();
		 LinkedHashSet<String> union_clone_1 = new LinkedHashSet<String>();
		 LinkedHashSet<String> union_clone_2 = new LinkedHashSet<String>();
		 LinkedHashSet<String> diff_clone_1 = new LinkedHashSet<String>();
		 LinkedHashSet<String> diff_clone_2 = new LinkedHashSet<String>();
		 LinkedHashSet<String> inter_clone_1 = new LinkedHashSet<String>();
		 LinkedHashSet<String> inter_clone_2 = new LinkedHashSet<String>();
		 
		 // Build first has set
		 hash_set_1.add("George");
		 hash_set_1.add("Jim");
		 hash_set_1.add("John");
		 hash_set_1.add("Blake");
		 hash_set_1.add("Kevin");
		 hash_set_1.add("Michael");
		 
		 //Build second hash set
		 hash_set_2.add("George");
		 hash_set_2.add("Katie");
		 hash_set_2.add("Kevin");
		 hash_set_2.add("Michelle");
		 hash_set_2.add("Ryan");
		 
		 //Create clones for union operation
		 union_clone_1 = (LinkedHashSet<String>)hash_set_1.clone();
		 union_clone_2 = (LinkedHashSet<String>)hash_set_2.clone();
		 
		 //Union of set 1 and set 2
		 union_clone_1.addAll(union_clone_2);
		 
		 System.out.println("The union of set 1 and set 2 is:" + union_clone_1);
		 
		 //Create clones for difference
		 diff_clone_1 = (LinkedHashSet<String>)hash_set_1.clone();
		 diff_clone_2 = (LinkedHashSet<String>)hash_set_2.clone();
		 
		 //Difference of set 1 and set 2
		 diff_clone_1.removeAll(diff_clone_2);
		 
		 System.out.println("The difference of set 1 and set 2 is:" + diff_clone_1);
		 
		//Create clones for intersection
		 inter_clone_1 = (LinkedHashSet<String>)hash_set_1.clone();
		 inter_clone_2 = (LinkedHashSet<String>)hash_set_2.clone();
		 
		 //Intersection of set 1 and set 2
		 inter_clone_1.retainAll(inter_clone_2);
		 
		 System.out.println("The intersection of set 1 and set 2 is:" + inter_clone_1);
	    }
	
}
