package WeekTwo;

public class wktwo {

	public static void main(String[] args) {
		int age = 16;
		
		System.out.println(age >= 16); // age >= 16, age = 14; resulted in false
		
		boolean hasLicense = false;
		
		if(age >= 16 && hasLicense)
			System.out.println("You can drive");
		else
			System.out.println("You cannot drive");
		
		double costOfMilk = 2.0;
		int thirstLevel = 7;
		if(costOfMilk < 2.50 || thirstLevel > 6) { //Milk = 2.0, thirstLevel = 5; resulted in Milk Please
			System.out.println("Milk Please");     //Milk = 3.0, thirstLevel = 5; resulted in No Thanks
	}											   //Milk = 2.0, thirstLevel = 7; resulted in Milk Please
		else {
			System.out.println("No thanks");
		}
		
		int numberOfCookies = 36;
		int numberOfChildren = 6;
		numberOfCookies %= numberOfChildren;
		if(numberOfCookies == 0) {
			System.out.println("Sad Face");
			}
		else if(numberOfCookies <= 2) {
			System.out.println("Yes!");
		}
		else if(numberOfCookies < 5) {
			System.out.println("Whoohooo!");
		}
		else if(numberOfCookies >= 5) {
			System.out.println("Jackpot!");
		}

		
	}

}
