package sort;

import java.util.List;

import sort.model.Dog;
import sort.service.SortService;
import sort.service.SortType;

public class MySort {
	private SortService sortService = new SortService();
	/**
	* @param args
	*/
	public static void main(String[] args) {
		new MySort().run();
		
	}

	private void run() {
		List<Dog> doggies = sortService.getDoggies(SortType.LAMBDA);
		print(doggies, SortType.LAMBDA);
		
	}

	private void print(List<Dog> people, SortType type) {
		switch (type) {
		
		case LAMBDA:
			System.out.println("Using LAMBDA...");
			people.forEach(doggie -> System.out.println(doggie.getName()));
			break;
		
		case METHOD_REFERENCE:
			System.out.println("Using METHOD_REFERENCE...");
			people.forEach(System.out::println);
			break;
			
		case ANONYMOUS_INNER_CLASS:	
			System.out.println("Using ANONYMOUS_INNER_CLASS...");
			for(Dog person : people) {
				System.out.println(person.getName());
			}
			break;
			
		case NORMAL_CLASS:
			System.out.println("Using NORMAL_CLASS...");
			for(Dog person : people) {
				System.out.println(person.getName());
			}
			break;
		
		default:
			break;
		}
	}
}