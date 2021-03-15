package day7;
import java.util.*;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> p1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> p2 = new ArrayList<Integer>(Arrays.asList(6,7,8,9,0));
		Iterator<Integer> it=p1.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(num<3) {
				it.remove();
			}
				
		}
		System.out.println(p1);
	}

}

