import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
{	
		Scanner input = new Scanner(System.in);
		while(true) {
		 System.out.println("Enter the number:");
		 int x = input.nextInt();
		 
		if(x > 0 && x <=100)
		{
			
		 if(x % 3 == 0  && x % 5 == 0) {
		 System.out.println("fizzbuzz");
		 } 	
		 else if(x % 3 == 0) {
		 System.out.println("fizz");
		 }
		 else if(x % 5 == 0) {
		 System.out.println("buzz");
		 }
		 else {
		 System.out.println(x);
		 }
		
		 if(x != 0) {
		 continue;
		 }
		}
		}
}
}
