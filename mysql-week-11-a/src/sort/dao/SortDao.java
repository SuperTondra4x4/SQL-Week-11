package sort.dao;

import java.util.ArrayList;
import java.util.List;

import sort.model.Dog;

public class SortDao {
	List<Dog> doggies = new ArrayList<>(List.of(
			new Dog("Ruffles"), new Dog("Billy"), new Dog("Pudge"), new Dog("Jack"), new Dog("Max"),
			new Dog("Al"), new Dog("Duke"), new Dog("Georgie"), new Dog("Sven"), new Dog("Toto")));
	
	public List<Dog> getDoggies() {
		return doggies;
	}
}
