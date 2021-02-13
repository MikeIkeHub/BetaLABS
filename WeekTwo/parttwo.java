package WeekTwo;

public class parttwo {

	public static void main(String[] args) {
		String loyaltyMemberStatus = "SILVER";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = .1;
			break;
		case "GOLD":
			loyaltyMemberDiscount = .15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = .25;
			break;
		}
		
		double billTotal = 600;
		double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
		if(adjustedTotal > 500);
			if(loyaltyMemberStatus == "SILVER" ) {
				loyaltyMemberStatus = "GOLD";
			}
			else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		
		System.out.println(adjustedTotal);
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		if(username.equals("Tommy123") && password.equals("12345")) //use .equals with Strings instead of ==
			System.out.println("login successful");
			else {
				System.out.println("access denied");
			}
		
		
		
	}

}
