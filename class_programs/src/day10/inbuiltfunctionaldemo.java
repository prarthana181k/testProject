package day10;
import java.util.function.Function;
import java.util.function.Predicate;
interface pre
{
	
}
public class inbuiltfunctionaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 =(age)->age>18;
		boolean b=p1.test(33);
		System.out.println(b);
		
		Predicate<String> s1 =(name)->name.startsWith("a");
		
		
	}

}
