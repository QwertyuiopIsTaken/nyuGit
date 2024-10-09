public class ExamPractice {
	public static void main(String[] args) {
		int[][] testArray = {
			{123, 23, 99},
			{13, 234, 122, 18},
			{1, 3, 90},
		};
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray[i].length; j++) {
				System.out.println(testArray[i][j]);
			}
		}

		int[] newArray = largestValues(testArray);
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		} 
		
	}

	public static int[] largestValues(int[][] array) {
		int[] bigArray = new int[array.length];
		// look at each sub-array
		for (int i = 0; i < array.length; i++) {
			int largest = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if (largest < array[i][j]) {
					largest = array[i][j];
				}
			}
			bigArray[i] = largest;
		}
		return bigArray;
	}
}