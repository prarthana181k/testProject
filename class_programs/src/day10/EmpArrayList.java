package day10;

import java.util.ArrayList;

public class EmpArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,"Megha","Data Scientist",100000,21, null));
		emplist.add(new Employee(2,"Harry", "dev", 100000,22, null));
		emplist.add(new Employee(3,"Ron", "hr", 100000,22, null));
		emplist.add(new Employee(4,"Hermoine", "manager", 100000,22, null));
		emplist.add(new Employee(5,"Sirius", "CA", 100000,22, null));
		
		//System.err.println("employee list" +emplist);
		
		emplist.forEach(s->System.out.println(s.getAge()));
		emplist.forEach(s->System.out.println(s));
		emplist.forEach(s->System.out.println(s.getName()));
		
		emplist.forEach(System.out::print);
		
		System.out.println("===count of employee=== ");
		long empcount=emplist.stream().count();
		System.out.println("employee count= "+empcount);
		
		emplist.stream().filter(e->e.getDept().equalsIgnoreCase("dev")).forEach(s->System.out.println(s));
		System.out.println(emplist.stream().filter(e->e.getDept().equalsIgnoreCase("dev")).count());
		
		System.out.println("======name length======");
		emplist.stream().map(e->e.getName()+" "+e.getName().length()+" "+e.getDept()).forEach(s->System.out.println(s));
		System.out.println("=========");
		
		System.out.println("======stream======");
		emplist.stream().forEach(e->System.out.print(e.getName()+" "));
		System.out.println("=========");
		
		
	}

}