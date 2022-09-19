package Computer;

public class Computer {

	String model;
	Ram ram;
	Ssd ssd;
	double price;

	public Computer() {

	}

	{
		this.model = "no model";
		this.ram = new Ram();
		this.ssd = new Ssd();
		this.price = 0;
	}

	public Computer(String model, double price) {
		this.model = model;
		this.ram = new Ram();
		this.ssd = new Ssd();
		this.price = price;
	}

	public Computer(String model, String modelRam, double ram, String modelSsd, double ssd, String type, double price) {
		this.model = model;
		this.ram = new Ram(modelRam, ram);
		this.ssd = new Ssd(modelSsd, ssd, type);
		this.price = price;
	}

	public void computerInfo() {
		System.out.println("model " + model);
		ram.ramInfo();
		ssd.ssdInfo();
		System.out.println("price " + price);
		System.out.println();
	}

	public void setSsd(String name, double capacity, String type) {
		this.ssd = new Ssd(name, capacity, type);

	}

	public void setRam(String name, double capacity) {
		this.ram = new Ram(name, capacity);

	}

}
