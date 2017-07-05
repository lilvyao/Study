
public class Permutation {
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	String s = prefix + str.charAt(i);
	        	String s1 = str.substring(0, i);
	        	String s2 = str.substring(i+1, n);
	        	permutation(s, s1+s2);
	        }       
	    }
	}

	public static void main(String[] args) {
//		String s = "abcd";
		permutation("abcd");
//		System.out.println(s.substring(0, 1));
	}
}
