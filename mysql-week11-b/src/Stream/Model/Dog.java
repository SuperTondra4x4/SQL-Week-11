package Stream.Model;

import java.util.Objects;

public class Dog implements Comparable<Dog>{
	private String name;

	public Dog(String name) {
		this.name = name;
	}


	public String getName() {
		String trimmed = name.trim();
		return trimmed;
	}

	public void setName(String name) {
		this.name = Objects.requireNonNull(name, "Name must not be null!");
	}

	@Override
	public int compareTo(Dog that) {
		int cmp = this.name.compareTo(that.name);
		return cmp;
	}


	@Override
	public String toString() {
		return name;
	}

}
