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
		int x = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				x++;
			}

		}
		return x;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double p = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > p) {
				p = peeps.get(i);
			}
		}
		return p;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String s = words.get(0);
		for (int j = 1; j < words.size(); j++) {
			if (words.get(j).length() > s.length()) {
				s = words.get(j);
			}
		}
		return s;
		// int i = 0;
		// for (int j = 0; j < words.size(); j++) {
		// if (words.get(j).length() > words.get(i).length()) {
		// i = j;
		// }
		// }
		// return words.get(i);
	}
}
