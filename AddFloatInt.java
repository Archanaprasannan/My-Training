import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.next();
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
	}

}

