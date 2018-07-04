package algorithm;

public class MergeSort {

	public static void main(String[] args) {
		int[] mainArray = { 1, 77, 26, 87, 33, 13, 22, 65, 3, 19 };
		MergeSort ms = new MergeSort();
		int[] sorted = ms.sort(mainArray);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}

	}

	public void print(int[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
		System.out.println();
	}

	public int[] sort(int[] array) {
		print(array);
		if (array.length <= 1) {
			return array;
		}
		int[][] splits = split(array);
		int[] firstArray = sort(splits[0]);
		int[] secondArray = sort(splits[1]);
		return merge(firstArray, secondArray);

	}

	public int[][] split(int[] array) {
		int[] firstArray = new int[(array.length / 2) + (array.length % 2 == 0 ? 0 : 1)];
		int[] secondArray = new int[array.length / 2];
		int aIndex = 0;
		for (int i = 0; i < firstArray.length; i++, aIndex += 1) {
			firstArray[i] = array[aIndex];

		}
		for (int i = 0; i < secondArray.length; i++, aIndex += 1) {
			secondArray[i] = array[aIndex];
		}
		return new int[][] { firstArray, secondArray };

	}

	public int[] merge(int[] array, int[] array2) {
		int merged[] = new int[array.length + array2.length];

		int a = 0;
		int a2 = 0;
		for (int m = 0; m < merged.length; m++) {
			if (a >= array.length) {
				merged[m] = array2[a2];
				a2++;
			} else if (a2 >= array2.length) {
				merged[m] = array[a];
				a++;
			} else if (array[a] > array2[a2]) {
				merged[m] = array2[a2];
				a2++;
			} else {
				merged[m] = array[a];
				a++;
			}

		}
		return merged;

	}

}
