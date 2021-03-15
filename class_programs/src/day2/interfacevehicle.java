package day2;
interface vehicle{
	abstract void no_of_wheels();
}
 class car implements vehicle{

	@Override
	public void no_of_wheels() {
		// TODO Auto-generated method stub
		System.out.println("no of wheels= 4");
	}
	 
 }
 class bike implements vehicle{

		@Override
		public void no_of_wheels() {
			// TODO Auto-generated method stub
			System.out.println("no of wheels= 2");
		}
		 
	 }
public class interfacevehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b=new bike();
		b.no_of_wheels();

	}

}
