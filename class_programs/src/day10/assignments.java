package day10;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"Megha","Data Scientist",100000,21,"nithin"));
		emplist.add(new Employee(2,"Harry", "dev", 100000,22,"nithin"));
		emplist.add(new Employee(2,"voldemort", "dev", 1000000,22,null));
		emplist.add(new Employee(3,"Ron", "hr", 100,22,"nithin"));
		emplist.add(new Employee(4,"Hermoine", "manager", 200000,22,"nithin"));
		emplist.add(new Employee(5,"Sirius", "CA", 10,22,"harish"));
		//System.out.print(emplist.stream().mapToInt(e->e.getSalary()).max());
		emplist.stream().filter(e->e.getSalary()>1500).map(em ->em.getSalary()).forEach(System.out::println);
		long g=emplist.stream().filter(e->e.getMgrname()=="nithin").count();
		System.out.print(g);
		List<Employee> l=emplist.stream().filter(e->e.getSalary()<=50000).collect(Collectors.toList());
		System.out.println(l);
		List<Employee> l2=emplist.stream().filter(e->e.getDept()=="dev").collect(Collectors.toList());
		System.out.println(l2);
	}

}
