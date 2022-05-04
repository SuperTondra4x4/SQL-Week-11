package sort.service;

import java.util.Comparator;
import java.util.List;

import sort.dao.SortDao;
import sort.model.Dog;

public class SortService {
	private SortDao sortDao = new SortDao();

	public List<Dog> getDoggies(SortType type) {
		List<Dog> doggies = sortDao.getDoggies();
		Comparator<Dog> comp = null;

		switch (type) {
		case ANONYMOUS_INNER_CLASS:
			comp = new Comparator<Dog>() {
				@Override
				public int compare(Dog p1, Dog p2) {
					return Dog.compareDoggies(p1, p2);
				}
			};
			break;

		case LAMBDA: // take a function and pass it around
			comp = (d1, d2) -> Dog.compareDoggies(d1, d2);
			break;

		case METHOD_REFERENCE:
			comp = Dog::compareDoggies;
			break;

		case NORMAL_CLASS:
			comp = new MySort();
			break;

		default:
			throw new RuntimeException("Unhandled sort type: " + type);

		}

		doggies.sort(comp);
		return doggies;
	}

	static class MySort implements Comparator<Dog> {

		@Override
		public int compare(Dog d1, Dog d2) {
			return Dog.compareDoggies(d1, d2);
		}

	}
}
