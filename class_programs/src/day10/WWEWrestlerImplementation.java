package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<wwe_Class> Wrestlerlist=new ArrayList<wwe_Class>();
		Wrestlerlist.add(new wwe_Class("Megha","Data Scientist",100));
		Wrestlerlist.add(new wwe_Class("Harry", "dev", 100));
		Wrestlerlist.add(new wwe_Class("Ron", "hr", 150));
		Wrestlerlist.add(new wwe_Class("Hermoine", "manager", 200));
		Wrestlerlist.add(new wwe_Class("Sirius", "CA", 100));
		System.out.println(Wrestlerlist.stream().count());
		System.out.println(Wrestlerlist.stream().filter(W->W.getWeight()>200).mapToInt(w->w.getWeight()).sum());
		List<String> l=Wrestlerlist.stream().map(s->s.getFirst_name()).collect(Collectors.toList());
		System.out.println(l);
	}

}
