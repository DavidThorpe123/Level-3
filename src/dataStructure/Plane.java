package dataStructure;

import java.util.ArrayList;

public class Plane {
	int nob;
	Snake s;
	ArrayList<Snake> snakes;

	ArrayList<Snake> snakes() {
		if (snakes == null) {

			snakes = new ArrayList<Snake>();
			for (int i = 0; i < 100; i++) {
				s = new Snake();
				snakes.add(s);
			}
		}
		return snakes;
	}

	public static void main(String[] args) {
		Plane plane = new Plane();
		int chance = plane.totalvenom() * 10 / 125;
		System.out.println(chance + "%");
	}

	public int totalvenom() {
		ArrayList<Snake> snakes = snakes();
		int vvenom = 0;
		for (int i = 0; i < snakes.size(); i++) {
			if (snakes.get(i).getVe()) {

				vvenom += snakes.get(i).getV();
			}
		}
		return vvenom;
	}
}
