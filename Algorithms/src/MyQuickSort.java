
public class MyQuickSort {

	private int[] array;
	
	public void sort(int[] input){
		if(input == null || input.length == 0) return;
		
		array = input;
		quickSort(0,array.length - 1);
	}
	
	private void quickSort(int low, int high){
		int i = low;
		int j = high;
		
		int pivot = array[low + (high - low) / 2];
		
		//go through the entire list, when i and j cross each other, i have checked
		//side of pivot (moved all bigger number to right, and smaller to left)
		while(i <= j){
			//find number of LHS that is bigger than pivot
			while(array[i] < pivot) i++;
			//find number of RHS that is bigger than pivot
			while(array[j] > pivot) j--;
			
			//move bigger number to right, and smaller to left
			if(i <= j){
				swap(i,j);//TODO
				i++;
				j--;
			}
		}
		
		//if i has not reach high, i am not done yet. perform sorting on RHS
		//of the pivot recursively
		if(i < high) quickSort(i, high);
		
		//if j has not reach low, i am not done yet. perform sorting on LHS
		//of the pivot recursively
		if(low < j) quickSort(low,j);
	}
	
	private void swap(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void main(String[] args){
		int[] input = {7,1,2,9,3,5,4,3,6,7,8,9};
		MyQuickSort sort = new MyQuickSort();
		sort.sort(input);
		for(int i : input){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
