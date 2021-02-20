package WeekThree;

public class BetaLabsPartOne {

	public static void main(String[] args) {
		int numbers[] = new int[] {1,5,2,8,13,6};
		numbers[0] = 1;
		numbers[1] = 5;
		numbers[2] = 2;
		numbers[3] = 8;
		numbers[4] = 13;
		numbers[5] = 6;
		
		System.out.println(numbers[0]); //prints first number in numbers array
		
		System.out.println(numbers[numbers.length - 1]); //prints last number in numbers array

		System.out.println(numbers[6]); //gives an exception
		
		System.out.println(numbers[-1]); //gives an exception
		
		for(int i = 0; i < numbers.length; i++) { // traditional loop for printing array
			System.out.println(numbers[i]);
		}
		
		for(int nums : numbers) { // enhanced loop for printing array
			System.out.println(nums);
		}
		
		double sum = 0; //total of numbers array
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		
		double average = sum/numbers.length; //average of numbers array
		System.out.println(average);
		
		for(int odd : numbers) { //prints odds of numbers array
			if(odd % 2 != 0)
			System.out.println(odd);
		}
		
		String names[] = new String[] {"Sam","Sally","Thomas", "Robert"};
		
		int sumOfNames = 0; //total of numbers letters
		for(String name : names) {
			sumOfNames = sumOfNames + name.length();
		}
		
		greeting("Michael");
		
		String welcome = greeting2("Michael");
		System.out.println(welcome);
		
		boolean a = isWordLonger("Jerry", 3);
		System.out.println(a);
		
		System.out.println(isStringInArray(names, "Robert"));
		
		System.out.println(smallestNumber(numbers));
		
		double[] numbas = new double[] {5.5,6.2,3.3};
		System.out.println(getDoubleAverage(numbas));
		
		int[] nameLetters = getStringLength(names);
		for(int word : nameLetters) {
			System.out.print(word + " ");
		}
		
		System.out.println(aPalindrome("racecar"));
		
	}

	public static void greeting(String name) { //prints name and greeting
		System.out.println(name + ", Welcome!");
	}
	
	public static String greeting2(String name) { //prints name and a different greeting
		return name + ", What's up!";
	}
	
	public static boolean isWordLonger(String word, int n) { //checks if word is longer than int n
		if(word.length() > n) { //can make it even shorter by doing (return word.length() > number;)
			return true;
		}
		return false;
	}
	
	public static boolean isStringInArray(String[] words, String string) { //returns true if the string is in array
		for(String same : words) {
			for(int i = 0; i < words.length; i++) {
				if(same.equals(string)) {					// for strings use .equals......  for numbers use ==
					return true;
				}
			}
		}
		return false;
	}
	
	public static int smallestNumber(int[] smallest) { //returns the smallest number in array
		int i = smallest[0];
		for(int number : smallest) {
			if(i > number) {
				i = 0;
				i = i + number;
			}
		}
		return i;
	}
	
	public static double getDoubleAverage(double[] average) { //finds average of a double array
		double i = 0;
		for(double number : average) {
			i = i + number;
		}
		return i / average.length;
	}
	
	public static int[] getStringLength(String[] letters) { //finds each string length in an array
		int[] stringLength = new int[letters.length];
		for(int i = 0; i < letters.length; i++) {
			stringLength[i] = letters[i].length();
		}
		return stringLength;
	}

	public static boolean evensVsOdds(String[] oddsEvens) { //returns true if there are more evens than odds
		int even = 0;
		int odd = 0;
		
		for(String word : oddsEvens) {
			if (word.length() % 2 == 0) {
				even = even + word.length();
			}
			else {
				odd = odd + word.length();
			}
		}
		return even > odd;
	}
	
	public static boolean aPalindrome(String string) { //returns true if word is a palindrome
		for (int i = 0; i <string.length(); i++) { //can put /2 at the end of string.length() for faster code
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
