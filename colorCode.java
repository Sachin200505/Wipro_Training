package wiproJavaTraining;
import java.util.*;
class colorCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a=='r' || a=='R') {
			System.out.println("Red");
		}
		else if(a=='y' || a=='Y') {
			System.out.println("Yellow");
		}
		else if(a=='b' || a=='B') {
			System.out.println("Blue");
		}
		else if(a=='g' || a=='G') {
			System.out.println("Green");
		}
		else if(a=='o' || a=='O') {
			System.out.println("Orange");
		}
		else if(a=='w' || a=='W') {
			System.out.println("White");
		}
		else {
			System.out.println("Invalid Color Code");
		}

	}

}
