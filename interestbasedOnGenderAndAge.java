package wiproJavaTraining;
import java.util.*;
public class interestbasedOnGenderAndAge {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
		if(args[0].equalsIgnoreCase("Male") && (age>=1 && age<=58)){
			System.out.println("The percentage of Interest is 8.4%");
		}
		else if(args[0].equalsIgnoreCase("Male") && (age>=59 && age<=100)){
			System.out.println("The percentage of Interest is 10.5%");
		}
		else if(args[0].equalsIgnoreCase("Female") && (age>=1 && age<=58)){
			System.out.println("The percentage of Interest is 8.2%");
		}
		else {
			System.out.println("The percentage of Interest is 9.2%");
		}
	}

}
