package fizzbuzz;

import org.junit.jupiter.api.Test;

class FizzbuzzTest {

	@Test
	void test() {
		Fizzbuzz Fb = new Fizzbuzz();
		for (int i = 1; i <= 100; i++) {
			System.out.println(Fb.action(i));
		}
	}

}
