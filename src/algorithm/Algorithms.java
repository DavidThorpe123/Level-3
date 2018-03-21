package algorithm;

import java.util.List;

public class Algorithms {

	public static Object findBrokenEgg(List<String> eggs) {
		// TODO Auto-generated method stub
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).contains("cracked")) {
				return i;
			}
		}
		return null;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub

		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).booleanValue() == true) {

			}

		}
		return null;
	}

}
