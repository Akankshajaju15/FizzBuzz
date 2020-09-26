package fizzbuzz;

public class Fizzbuzz {

	public String action(int i) {
		String x = "";
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else {
			x = x + i;
			return x;
		}
	}

}
