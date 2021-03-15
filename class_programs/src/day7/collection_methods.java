package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class collection_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> p1 = new ArrayList<String>(Arrays.asList("sachin","rahul","amit","kumar"));
		ArrayList<String> p2 = new ArrayList<String>(Arrays.asList("roshan","varsha","rahul","amit","harshit"));
		p1.removeAll(p2);
		p1.addAll(p2);
		System.out.println("list is"+p1);
		Collections.sort(p1);
		System.out.println("list is"+p1);
		int i=Collections.binarySearch(p1,"sachin");
		System.out.println("list index is"+i);

	}

}
