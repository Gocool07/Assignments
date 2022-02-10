package programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Descend {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(86);
		a.add(11);
		a.add(7);
		a.add(46);
		a.add(24);
		System.out.println("Before Descending Order : "+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("After Descending Order : "+a);
		
	}

}
