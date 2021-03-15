package day2.oops;

class bank1 {
	void rate_of_interest()
	{
		System.out.println("5%");
		
	}
	static void displays()
	{
		System.out.println("display parent ");
		
	}

}
class sbi1 extends bank1{
	void rate_of_interest()
	{
		System.out.println("4%");
		
	}
	static void displays()
	{
		System.out.println("display child");
		
	}

}
public class poly {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank1 bank2=new sbi1();
		bank2.displays();

	}

}