package wiproJavaTraining;
import java.util.*;
public class posNegZero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("The Given Integer is a Positive Number");
		}
		else if(n==0) {
			System.out.println("The Give Integer is Zero");
		}
		else {
			System.out.println("The Given Integer is a Negative Number");
		}

	}

}
