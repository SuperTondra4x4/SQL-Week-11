package sort.model;

public class Dog {
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compareDoggies(Dog d1, Dog d2) {
		return d1.name.compareTo(d2.name);
	}
	
}
