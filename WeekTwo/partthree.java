package WeekTwo;

public class partthree {

	public static void main(String[] args) {
		for(int i = 0; i <= 9; i++) {
			System.out.println(i);
		}
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		for(int i = 0; i <= 50; i++) { //multiple ways to do every other number from 0 to 100
			System.out.println(i*2);
		}
		for(int i = 0; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println("EVEN"); //can do an else statement after: else { System.out.println("ODD"); }
			}
			if(i % 2 != 0) {
				System.out.println("ODD");
			}
		}
		
		int x = 100;
		while (x >= 0) {
			System.out.println(x + " " + (x % 3)); //divides it by 3 and posts the remainder
			x--;
		}
	}

}
