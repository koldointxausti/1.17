import java.util.Scanner;

public class Review {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while (n!=1) {
		System.out.println("Select one option:");
		System.out.println("[1] Given a positive number tells how many even digit has the number");
		System.out.println("[2] Given a positive number and a digit tells whether the digit appears in the number or not and in case yes, how many times.");
		System.out.println("[3] Given a positive number it gives us the inverted number.");
		System.out.println("[4] Given a binary number it gives us its decimal value.");
		System.out.println("[5] Given a sentence and a letter it gives the number of words of the sentence that begins with that letter.");
		System.out.println("[6] Given a sentence and a letter it gives the number of words of the sentence that ends with that letter.");
		System.out.println("[7] Given a word it tells the user whether the word is a palindrome or it is not.");
		System.out.println("[0] Exit");
		int option = sc.nextInt();
		switch (option) {
		//if the user enters 0 the program will stop
		case 0:
			n=1;
			System.out.println("The program has been stopped.");
			break;
		case 1: 
			System.out.println("**EVEN NUMBERS**");
			System.out.println("Enter a number:");
			Integer a = sc.nextInt();
			//to be sure the number is positive
			while (a < 0) {
				System.out.println("Enter a positive number:");
				a = sc.nextInt();
			}
			//convert the number to a String
			String number = a.toString();
			//save it in a array
			char numbers[] = number.toCharArray();
			int counter = 0;
			//create a loop
			for(int i=0;number.length()>i; i++) {
				//to check if each number is
				switch (numbers[i]) {
				//even
				case '0': case '3': case '5': case '7': case '9': 
					break;
				//or odd
				case '2': case '4': case '6': case '8':
					counter++;
					break;
				}
			}
			System.out.println(number +" has "+ counter + " even digits.");
			break;
		case 2: 
			System.out.println("**NUMBER & DIGIT**");
			//ask for a number
			System.out.println("Enter a number");
			Integer num1 = sc.nextInt();
			//to be sure the number is positive
			while (num1 < 0) {
				System.out.println("Enter a positive number:");
				num1 = sc.nextInt();
			}
			//ask for a digit
			System.out.println("Now enter one digit:");
			Integer num2 = sc.nextInt();
			//to be sure the digit is positive
			while (num2 < 0) {
				System.out.println("Enter a positive digit:");
				num2 = sc.nextInt();
			}
			//convert them to Strings to compare digit by digit
			String numA = num1.toString();
			String numB = num2.toString();
			//define a counter
			int erantzuna = 0;
			//do a loop to compare each character of the 1st one with the digit and repeat it as long as we can
			for(int i = 0; i<numA.length();i++) {
				if(numA.charAt(i)==numB.charAt(0)) {
					erantzuna++;
				}
			}
			System.out.println("The 2nd number you entered is "+erantzuna+" times repeted.");
			break;
		case 3:
			System.out.println("**INVERT NUMBER**");
			boolean one = true;
			System.out.println("Enter a number: ");
			while (one == true) {
				if(sc.hasNextInt()) {
					Integer c = sc.nextInt();
					if (c > 0) {
						String c1 = c.toString();
						System.out.println("This is the inverted number of the one you entered: ");
						for (int i = c1.length()-1; i>=0; i--) {
							System.out.print(c1.charAt(i));
							one = false;
						}
						System.out.println("");
					}else {
						System.out.println("Enter a positive number:");
					}
				}
				else {
					System.out.println("Enter a number:");
				}
			}
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
		case 6:
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
			break;
		default:
			//to make the user choose one of the numbers we want
			System.out.println("Enter a valid number");
			option=sc.nextInt();
			break;
		}
		}
	}
}
