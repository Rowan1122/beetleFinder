package beetleFinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
					
		System.out.println("\n*BUZZING*\n...\n...\n...\n\nPlease type the number of beetles buzzing, as a whole number:");

		Scanner beetleScanner = new Scanner (System.in);

		int beetleInt = beetleScanner.nextInt();
			
		if (beetleInt == 1) {
			System.out.print("There is " + beetleInt + " beetle!");
		}
		else if(beetleInt != 1) {
			System.out.println("There are " + beetleInt + " beetles!"); 
		}
		if (beetleInt > 99){
			System.out.println("A SWARM OF BEETLES!!! They must love you!");	
		}
				
		if (beetleInt < 0) {
			System.out.println("So sad... the beetles left you.");	
		}
				
		if (beetleInt == 0) {
			System.out.println("you're imagining things... no beetles... maybe try making other friends?");	
		}
		
		beetleScanner.close();
	}
}
