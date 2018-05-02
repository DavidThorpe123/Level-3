package dataStructure;

import java.util.Random;

public class Randomness {

	public static int viciousness() {
		int ran = new Random().nextInt(11);
		return ran;

	}

	public static boolean venomous() {
		return new Random().nextBoolean();

	}
}
