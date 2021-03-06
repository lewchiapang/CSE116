public class MergeSort extends Thread{

	private double[] numbers;
	private double[] temp;
	private int number;
	
	
	
	public double retIndex(int f){
		return numbers[f];
	}
	public void sort(double[] values) {
		this.numbers = values;
		number = values.length;
		this.temp = new double[number];
		mergesort(0, number - 1);
	}

	private void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
			
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy both parts into a temp array
		for (int i = low; i <= high; i++) {
			temp[i] = numbers[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (temp[i] <= temp[j]) {
				numbers[k] = temp[i];
				i++;
			} else {
				numbers[k] = temp[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = temp[i];
			k++;
			i++;
			
		}
		

	}
	
	
}

