package Computer;

public class Ssd {

	String name;
	double capacity;
	String type;

	public Ssd() {

	}

	{
		this.name = "no name";
		this.capacity = 0;
		this.type = "no type";
	}

	public Ssd(String name, double capacity, String type) {
		this.name = name;
		this.capacity = capacity;
		this.type = setTypeSsd(type);
	}

	private String setTypeSsd(String type) {
		if (type == "internal") {
			this.type = "internal";
			return this.type;
		} else if (type == "external") {
			this.type = "external";
			return this.type;
		} else {
			return "unknown type";
		}
	}

	public void ssdInfo() {
		System.out.println("ssd name " + this.name);
		System.out.println("ssd capacity " + this.capacity);
		System.out.println("ssd type " + this.type);
	}

}
