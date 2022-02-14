package week1.day5;

public class Palindrome {
	public static void main(String[] args) {
		// text madam
		String input = "madam";
		String rev = "";
		System.out.println(input.length());
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
			// System.out.println(rev);

		}
		if (input.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}

	}

}
