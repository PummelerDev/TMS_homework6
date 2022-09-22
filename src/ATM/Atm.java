package ATM;

import java.util.Scanner;

public class Atm {

	Banknote twenty = new Banknote(20, 0);
	Banknote fifty = new Banknote(50, 0);
	Banknote hundret = new Banknote(100, 0);

	public Atm() {

	}

	{
		this.twenty.addBanknote(0);
		this.fifty.addBanknote(0);
		this.hundret.addBanknote(0);
	}

	public Atm(int quantity20, int quantity50, int quantity100) {
		this.twenty.addBanknote(quantity20);
		this.fifty.addBanknote(quantity50);
		this.hundret.addBanknote(quantity100);
	}

	public void addMoney(int quantity20, int quantity50, int quantity100) {
		this.twenty.addBanknote(quantity20);
		this.fifty.addBanknote(quantity50);
		this.hundret.addBanknote(quantity100);
	}

	public void withdrawMoney() {
		int input = 0;
		while (true) {
			input = toCheckInput();
			if (totalAmountMoney() >= input) {
				break;
			} else {
				System.out.println("insufficient funds");
				return;
			}
		}
		availableBanknotes();
		toGiveMoney(input);
	}

	public void atmInfo() {
		System.out.println("Banknote 20. Quantity " + this.twenty.quantity);
		System.out.println("Banknote 50. Quantity " + this.fifty.quantity);
		System.out.println("Banknote 100. Quantity " + this.hundret.quantity);
	}

	private int toCheckInput() {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		while (true) {
			System.out.println("enter sum of money: ");
			if (scan.hasNextInt()) {
				int i = scan.nextInt();
				if (i % 10 == 0 && i != 10 && i != 30 ) {
					input = i;
					scan.close();
					return input;
				} else {
					System.out.println("incorrect data, try again: ");
					scan.next();
				}
			} else {
				System.out.println("incorrect data, try again: ");
				scan.next();
			}
		}

	}

	private int totalAmountMoney() {
		return this.twenty.value * this.twenty.quantity + this.fifty.value * this.fifty.quantity
				+ this.hundret.value * this.hundret.quantity;
	}

	private void availableBanknotes() {
		System.out.println("there are banknote: ");
		if (this.twenty.quantity > 0)
			System.out.println("20");
		if (this.fifty.quantity > 0)
			System.out.println("50");
		if (this.hundret.quantity > 0)
			System.out.println("100");
	}

	private void toGiveMoney(int input) {
		System.out.println("Your money: ");
		while (true) {
			if (input >= this.hundret.value && input <= this.hundret.value * this.hundret.quantity
					&& (input % this.fifty.value <= 0)) {
				input = calculation(input, this.hundret.value, this.hundret.quantity);
			}
			if (input >= this.fifty.value && input <= this.fifty.value * this.fifty.quantity
					&& (input % this.twenty.value > 0)) {
				input = calculation(input, this.fifty.value, this.fifty.quantity);
			}
			if (input >= this.twenty.value && input <= this.twenty.value * this.twenty.quantity
					&& input >= this.twenty.value) {
				input = calculation(input, this.twenty.value, this.twenty.quantity);
			}
			System.out.println();
			if (input == 0)
//				System.out.println("Error");
				break;
		}

	}

	private int calculation(int input, int value, int quantity) {
		input -= value;
		System.out.print(1 + " x " + value + "$, ");
		removeBanknote(1, value);
		return input;
	}

	private void removeBanknote(int i, int value) {
		if (value == this.twenty.value)
			this.twenty.quantity -= i;
		if (value == this.fifty.value)
			this.fifty.quantity -= i;
		if (value == this.hundret.value)
			this.hundret.quantity -= i;
	}

}
