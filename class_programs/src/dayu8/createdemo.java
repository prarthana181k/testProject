package dayu8;
class megha extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("megha"+i);
		}
	}
	
}
class pranav extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("pranav"+i);
		}
	}
	
}
class sneha extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("sneha"+i);
		}
	}
	
}

public class createdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		megha o =new megha();
		pranav o2 =new pranav();
		sneha o3 =new sneha();
		o.start();
		o2.start();
		o3.start();
	}

}
