package Stream.Service;

import java.util.stream.Collectors;
import Stream.DAO.DogDao;

public class DogService {
	private DogDao dogDao = new DogDao();

	public String getNames() {
		// @formatter:off
		return dogDao.getDoggies().stream()
//		.filter(name -> name.getName().contains(""))
		.map(p -> p.toString())
//		.map(name -> new String(name.getName()))
		.sorted()
		.collect(Collectors.joining(", "));
	}

}
