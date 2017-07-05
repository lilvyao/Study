public class test {
	
	public static void merge(int[] input){
		int size = input.length;
		if(size <= 1) return;
		
		int middle = size / 2;
		int[] left = new int[middle];
		int[] right = new int[size - middle];
		
		for(int i = 0; i < middle; i++){
			left[i] = input[i];
		}
		
		for(int j = middle; j < size; j++){
			right[j - middle] = input[j];
		}
		
		merge(left);
		merge(right);
		
		mergeSort(left, right, input);
	}
	
	private static void mergeSort(int[] left, int[] right, int[] input){
		int leftSize = left.length;
		int rightSize = right.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < leftSize && j < rightSize){
			if(left[i] < right[j]){
				input[k] = left[i];
				i++;
				k++;
			}
			else{
				input[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < leftSize){
			input[k] = left[i];
			k++;
			i++;
		}
		
		while(j < rightSize){
			input[k] = right[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args){
		int[] input = {3,1,9,5,7,5,4,8,1,5,6,3,2};
		merge(input);
		
		for(int i : input) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
