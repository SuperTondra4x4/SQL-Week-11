package myStream;

import Stream.Service.DogService;

public class Streaming {
	private DogService dogService = new DogService();

	public static void main(String[] args) {
		new Streaming().run();

	}

	private void run() {
		String orderedNames = dogService.getNames();
//		DogDao dogDao2 = new DogDao();
//		System.out.println(dogDao2.getDoggies());
//		System.out.println();
		System.out.println(orderedNames);

	}

}
