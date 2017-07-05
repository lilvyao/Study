public class MyMergeSort {
	
	
	public static void mergeSort(int[] input){
		
		//Goal: Break down a list of entries into single elements,
		//and then merge them back in ascending order
		if(input.length < 2) return;
		
		//keep spliting the entire list into 2 from the middle
		int middle = input.length / 2;
		int[] left = new int[middle];
		int[] right = new int[input.length - middle];
		
		for(int i = 0; i < middle; i++){
			left[i] = input[i];
		}
		
		for(int i = middle; i < input.length; i++){
			right[i-middle] = input[i];
		}
		
		//perform the split recursively
		mergeSort(left);
		mergeSort(right);
		
		//merge back in ascending order
		merge(left, right, input);
	}

	private static void merge(int[] left, int[] right, int[] input){
		
		//idea: read a number from each side, and put them back to a list
		//in ascending order
		int leftSize = left.length;
		int rightSize = right.length;
		
		int i = 0;//index of left
		int j = 0;//index of right
		int k = 0;//index of final list
		
		while(i < leftSize && j < rightSize){
			
			//number on left list is smaller, put it in final list first
			if(left[i] < right[j]){
				input[k] = left[i];
				i++;
				k++;
			}
			else{ // number on right list is bigger, put it in final list first
				input[k] = right[j];
				j++;
				k++;
			}
		}
		
		//if left list is not empty, put all numbers into final list in order
		while(i < leftSize){
			input[k] = left[i];
			i++;
			k++;
		}
		
		//if right number is not empty, put all numbers into final list in order
		while(j < rightSize){
			input[k] = right[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args){
		int[] input = {3,1,4,6,8,8,8,5,3,2,2,5,1};
		mergeSort(input);
		
		for (int i : input){
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
