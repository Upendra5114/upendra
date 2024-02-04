import java.util.Scanner;
public class Hello
{
	public static void main(String[] args) {
	    String user;
	    System.out.println("Enter user name: ");
	    Scanner input = new Scanner(System.in);
	    user = input.nextLine();
	    input.close();
		System.out.println("Hello, "+user);
	}
}
