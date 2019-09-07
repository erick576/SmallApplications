import java.util.Scanner;
public class Between1and100 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 int num = (int)(Math.random()*100);
	 System.out.println("Guess the number");
	 int guess = input.nextInt();
	
	 while(guess != num) {
	System.out.println("Wrong! Please try again");
	System.out.println("Try a new number");
	guess = input.nextInt();
	 }
	
	 if(guess == num) {
			System.out.println("Congrats! You guessed the right number!");
		}
	
	input.close();
	
	}

}
