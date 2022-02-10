package programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Covertset {
	public static void main(String[] args) {

		Set<String> h =new HashSet<>();
		h.add("hello");
		h.add("every");
		h.add("one");
		System.out.println("hashset values:"+h);
		Set<String> t=new TreeSet<>(h);
		System.out.println("Treeset :"+t);
	}

}
