package day_9;
@FunctionalInterface
interface Test1{
	void display();
}
class Mydemo2{
	void method2() {
		System.out.println("this is method1");
	}
}
public class func_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=()->System.out.println("*");
		Mydemo2 d= new Mydemo2();
		Test1 t2=d::method2;
		t.display();
		t2.display();
	}

}
