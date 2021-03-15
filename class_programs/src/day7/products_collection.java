package day7;
import java.util.*;
class products{
	int pid;
	String pname;
	int price;;
	
    public products(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	@Override
    public String toString() {
        return "Product [proID=" + pid + ", name=" + pname + ", price=" + price + "]";
    }
}
public class products_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<products> p1=new ArrayList<products>();
		p1.add(new products(101,"prar",1234));
		p1.add(new products(102,"pra",12345));
		p1.add(new products(103,"par",1434));
		System.out.println(p1);
		Iterator<products> it=p1.iterator();
		while(it.hasNext()) {
			products p=it.next();
			if (p.price>10000)
				System.out.println(p);
		}
	}

}
