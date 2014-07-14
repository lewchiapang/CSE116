
public class Main {
static double[] ArrayToBeSorted; 
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ArrayToBeSorted = new double[1001];
		MergeSort ms = new MergeSort();
		for(int i=0; i< 1000; i++){
			
			ArrayToBeSorted[i] = Math.random();
			
		
		}
		//start the Merge sort thread and pass the array
		ms.start();
		ms.sort(ArrayToBeSorted);
		
		//wait until thread is finished
		ms.join();
		
		//check if it worked!!
		int c=0;
		boolean ret =true;
		// read the newly sorted array
		for (int b = 1; b < ArrayToBeSorted.length; b++) {
			ArrayToBeSorted[b] = ms.retIndex(b);
			}
		// check if array is sorted
		for (int b = 1; b < ArrayToBeSorted.length; b++) {
			if (ArrayToBeSorted[c] < ArrayToBeSorted[b]) {
				c = b;
				ret = true;
			} else {
				ret = false;
				
			}
			}
		if (ret == true) {
			System.out.println("The list is sorted");
			
		}else{
			System.out.println("Your program is wrong");
		}
		

	}

}
