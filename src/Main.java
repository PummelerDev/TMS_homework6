import ATM.Atm;
import Computer.Computer;
import Matrix.Matrix;

public class Main {

	public static void main(String[] args) {

//
//		the ctedit card task

//		CreditCard bsb = new CreditCard("123bc10BSB009", 5000);
//		CreditCard mtb = new CreditCard("145bv34MTb098", 4000);
//		CreditCard alfa = new CreditCard("574js55ALFA31", 7000);
//
//		bsb.addMoney(3500);
//		mtb.addMoney(3300);
//		alfa.withdrawMoney(200);
//
//		bsb.accountBalance();
//		mtb.accountBalance();
//		alfa.accountBalance();

//		
//		copmuter task

//		Computer lenovo = new Computer();
//		lenovo.computerInfo();
//
//		Computer asus = new Computer("Zenbook pro", "Corsair", 16, "Samsung", 512, "internal", 2498);
//		asus.computerInfo();
//
//		Computer samsung = new Computer("Galaxy Book2 Pro", 6000);
//		samsung.computerInfo();
//		samsung.setRam("Corsair", 16);
//		samsung.setSsd("Samsung", 512, "internal");
//		samsung.computerInfo();

//		
//		ATM task
//		Atm payoneer = new Atm(100, 100, 100);
//		payoneer.addMoney(50, 50, 50);
//		payoneer.withdrawMoney();
//		payoneer.atmInfo();

//		
//		Matrix task
		Matrix matrix = new Matrix(3, 3);
		matrix.printMatrix();
		Matrix matrix1 = new Matrix(3, 3);
		matrix1.printMatrix();
		
		Matrix plus = matrix.plus(matrix1);
		plus.printMatrix();
		
		Matrix multiplyByNumber = matrix.multiplyByNumber(10);
		multiplyByNumber.printMatrix();
		
		Matrix multiply = matrix.multiply(matrix1);
		multiplyByNumber.printMatrix();
	}

}
