package wiproJavaTraining;
import java.util.*;
public class findChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>='A' && a<='z') {
			System.out.println("Alphabet");
		}
		else if(a>='0' && a<='9') {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special character");
		}

	}

}
