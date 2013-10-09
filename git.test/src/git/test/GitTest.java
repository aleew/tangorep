package git.test;

import java.util.Scanner;

//Test project for git

public class GitTest {
	public static void main(String[] args) {
		System.out.println("1...\n");
		System.out.println("2...");
		
		Scanner sc = new Scanner(System.in);
		
		String scan = "";
		
		do {
			scan = "";
			scan = sc.nextLine();
			
			if (scan.equals("1")) {
				System.out.println("Hello world");
			}

			if (scan.equals("2")) {
				System.out.println("Hello world2");
			}
			
		} while (!scan.equals("0"));
				
	}
}