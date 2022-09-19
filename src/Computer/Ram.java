package Computer;

public class Ram {

	String name;
	double capacity;

	public Ram() {

	}

	{
		this.name = "no name";
		this.capacity = 0;
	}

	public Ram(String name, double capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	public void ramInfo() {
		System.out.println("ram name " + this.name);
		System.out.println("ram capacity " + this.capacity);
	}

}
