package day6;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class regualrexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("a");
		Pattern p1=Pattern.compile("[abc]");
		Matcher m1=p1.matcher("sachine");
		while(m1.find()) {
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	}

}
