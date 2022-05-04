import java.util.NoSuchElementException;
import java.util.Optional;

public class PizzaOptional {

	public static void main(String[] args) {
		new PizzaOptional().run();

	}

	private void run() {
		Pizza pizza = pizzaMethod(Optional.of(new Pizza("Hawaiian")));
		System.out.println("I have a " + pizza);
		Optional<Pizza> full = Optional.of(new Pizza("Sausage"));
		checkForPizza(full);
		Optional<Pizza> empty = Optional.empty();
		checkForPizza(empty);
	}

	private void checkForPizza(Optional<Pizza> pizza) {

		try {
			System.out.println(pizzaMethod(pizza) + " is here.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Pizza pizzaMethod(Optional<Pizza> pizzaOptional) {
		return pizzaOptional
				.orElseThrow(() -> new NoSuchElementException("The pizza " + pizzaOptional + " isn't here."));
	}
}
