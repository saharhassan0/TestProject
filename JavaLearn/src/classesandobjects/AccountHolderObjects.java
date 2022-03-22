package classesandobjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
	//create object for tom,henry,sarah	
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastNamre="smith";
		tom.age=21;
		tom.accountBalance=10000;
		tom.testEligibilityForCreditCard();
		System.out.println("Is Tom E ligible for cc?: " + tom.eligibleForCreditCard);
	}
}
