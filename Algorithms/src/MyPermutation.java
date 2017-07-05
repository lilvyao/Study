public class MyPermutation {
	
	public static void permutation(String input){
		showPermutation("", input);
	}
	
	private static void showPermutation(String head, String tail){
		int length = tail.length();
		if(length == 0) System.out.println(head);
		else{
			for (int i = 0; i < length; i++){
				String currentHead = head + tail.charAt(i);
				String s1 = tail.substring(0, i);
				String s2 = tail.substring(i+1, length);
				showPermutation(currentHead, s1+s2);
			}
		}
	}

	public static void main(String[] args) {
		String input = "1234";
		permutation(input);
	}

}
