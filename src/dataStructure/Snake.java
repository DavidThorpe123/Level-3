package dataStructure;

public class Snake {
	int viciousness;
	boolean venomous;

	Snake() {
		viciousness = Randomness.viciousness();
		venomous = Randomness.venomous();
	}

	public int getV() {
		return viciousness;
	}

	public boolean getVe() {
		return venomous;
	}
}
