
public class CreditCard {

	CreditCard() {

	}

	CreditCard(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	String accountNumber;
	double balance;

	void addMoney(double money) {
		this.balance += money;
		System.out.println("added " + money + "$");
		accountBalance();
	}

	void withdrawMoney(double money) {
		if (balance < money) {
			System.out.println("insufficient funds");
			accountBalance();
			return;
		}
		this.balance -= money;
		System.out.println("withdrawn " + money + "$");
		accountBalance();

	}

	void accountBalance() {
		System.out.println("account nuber " + accountNumber);
		System.out.println("your balance " + balance);
		System.out.println();
	}

}
