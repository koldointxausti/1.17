import java.util.Scanner;

public class Review {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one option:");
		System.out.println("[1] Given a positive number tells how many even digit has the number");
		System.out.println("[2] Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times.");
		System.out.println("[3] Given a positive number it gives us the inverted number.");
		System.out.println("[4] Given a binary number it gives us its decimal value.");
		System.out.println("[5] Given a sentence and a letter it gives the number of words of the sentence that begins with that letter.");
		System.out.println("[6] Given a sentence and a letter it gives the number of words of the sentence that ends with that letter.");
		System.out.println("[7] Given a word it tells the user whether the word is a palindrome or it is not.");
		
		int option = sc.nextInt();
		//to make the user choose one of the numbers we want
		while (option<=0||option>7) {
			System.out.println("Enter a valid number");
			option=sc.nextInt();
		}
		switch (option) {
		case 1: 
			System.out.println("**EVEN NUMBERS**");
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			while (a < 0) {
				System.out.println("Enter a positive number:");
				a = sc.nextInt();
			}
			int counter = 1;
			while (a>0) {
				if(a%2==0) {
					counter++;
				}
				a--;
			}
			System.out.println("The number you entered has " +counter+" even numbers.");
			break;
		case 2: 
			System.out.println("**NUMBER & DIGIT**");
			System.out.println("Enter a long number");
			Integer num1 = sc.nextInt();
			System.out.println("Now enter a one-digit-number:");
			Integer num2 = sc.nextInt();
			//convert them to Strings to compare digit by digit
			String numA = num1.toString();
			String numB = num2.toString();
			int erantzuna = 0;
			for(int i = 0; i<numA.length();i++) {
			if(numA.charAt(i)==numB.charAt(0)) {
				erantzuna++;
			}
			}
			System.out.println("The 2nd number you entered is "+erantzuna+" times repeted.");
			break;
		case 3:
			System.out.println("**INVERT NUMBER**");
			System.out.println("Enter a number: ");
			int c = sc.nextInt();
			if (c > 0) {
				c = c - (c * 2);
			}else {
				c = c + (-c * 2);
			}
			System.out.println("This is the inverted number of the one you entered: "+c);
			break;
		case 4:
			//don't know how to do it
			break;
		case 5:
			System.out.println("**NUMBER OF WORDS THAT STARTS WITH**");
			System.out.println("Enter a sentence:");
			//needed to put this to scan the sentence
			sc.nextLine();
			String sentence = sc.nextLine();
			//String[] word = new String[total];
			String[] words = sentence.split(" ");
			int total = words.length;
			System.out.println("Enter a letter");
			char letter=sc.next().charAt(0);
			int times=0;
			for ( int i = 0; i<total;i++) {
				if (words[i].charAt(0) == letter) {
					times++;
				}
			}
			System.out.println("This sentence has "+times+ " words that starts with " +letter);
			break;
		case 6: //not finished
			System.out.println("**NUMBER OF WORDS THAT FINISHES WITH**");
			System.out.println("Enter a sentence:");
			//needed to put this to scan the sentence
			sc.nextLine();
			String sentence2 = sc.nextLine();
			//String[] word = new String[total];
			String[] words2 = sentence2.split(" ");
			int total2 = words2.length;
			System.out.println("Enter a letter");
			char letter2=sc.next().charAt(0);
			int times2=0;
			for ( int i = 0; i<total2;i++) {
				if (words2[i].charAt(words2[i].length()-1) == letter2) {
					times2++;
				}
			}
			System.out.println("This sentence has "+times2+ " words that finishes with " +letter2);
			break;
		case 7:
			System.out.println("**PALINDROME**");
			System.out.println("Enter a word");
			String palindrome = sc.next();
			sc.close();
			int up = 0;
			int down = palindrome.length()-1;
			while (up<palindrome.length()) {
				if (palindrome.charAt(up)==palindrome.charAt(down)) {
					up++;
					down--;
				}else {break;}
			}
			if (up == palindrome.length()-1) {
				System.out.println("It's palindrome.");
			}else{
				System.out.println("It's not palindrome.");
			}
			
		}
	}
}
