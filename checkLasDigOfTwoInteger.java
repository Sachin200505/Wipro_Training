package wiproJavaTraining;
import java.util.*;
public class checkLasDigOfTwoInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int lastm=m%10;
		int lastn=n%10;
		if(lastm==lastn) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
