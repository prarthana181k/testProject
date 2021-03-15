package day3.oops;
class person{
	int id;
	String name;
	int age;
}
class cricketer extends person{
	String role;
	void display_details() {
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
}
class employee1 extends person{
	String dept;
}
class student extends person{
	String role;
}
class manager extends person{
	String role;
}
public class inhertenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketer cric= new cricketer();
		cric.id=1;
		cric.name="sujatha";
		cric.display_details();
		

	}

}
