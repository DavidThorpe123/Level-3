package algorithm;

public class MergeSort {

	public static void main(String[] args) {
		int[] mainArray = { 1, 77, 26, 87, 33, 13, 22, 65, 3, 19, };
		int current = 0;
		for (int i = 0; i < mainArray.length; i += 2) {
			int[] sortedArray = new int[2];
			sortedArray[0] = mainArray[i];
			sortedArray[1] = mainArray[i + 1];
			if (sortedArray[0] > sortedArray[1]) {
				mainArray[i + 1] = sortedArray[0];
				mainArray[i] = sortedArray[1];

			}

		}
		for (int i = 0; i < mainArray.length; i += 2) {
			int[] sortedArray2 = new int[2];
			sortedArray2[0] = mainArray[i];
			sortedArray2[1] = mainArray[i + 2];
			if (sortedArray2[0] > sortedArray2[2]) {
				mainArray[i + 2] = sortedArray2[0];

			}

		}
		for (int i = 0; i < mainArray.length; i++) {
			System.out.println(mainArray[i]);
		}
	}
}
