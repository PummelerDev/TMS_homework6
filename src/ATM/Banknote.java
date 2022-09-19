package ATM;

public class Banknote {

	int value;
	int quantity;

	public Banknote(int value, int quantity) {
		this.value = value;
		this.quantity = quantity;
	}

	public void addBanknote(int quantity) {
		this.quantity += quantity;
	}

}
