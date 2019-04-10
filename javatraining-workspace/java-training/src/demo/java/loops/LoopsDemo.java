package demo.java.loops;

public class LoopsDemo {

	public static void main(String[] args) {
		String[] alphabet = { "A", "B", "C", "D", "E", "F" };
		concatWithWhile(alphabet);
		concatWithDoWhile(alphabet);
		concatWithClassicFor(alphabet);
		concatWithForEach(alphabet);
	}

	private static void concatWithWhile(String[] alphabet) {
		System.out.println("Concating the alphabet using while:");
		String result = "";
		int i = 0;
		while (i < alphabet.length) {
			result += alphabet[i];
			i = i + 1;
		}
		System.out.println(result);
	}

	private static void concatWithDoWhile(String[] alphabet) {
		System.out.println("Concating the alphabet using do while:");
		String result = "";
		int i;
		i = 0;
		do {
			result += alphabet[i];
			i += 1;
		} while (i < alphabet.length);
		System.out.println(result);
	}

	private static void concatWithClassicFor(String[] alphabet) {
		System.out.println("Concating the alphabet using classic for:");
		String result = "";
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i].equals("D")) {
				return;
			}
			result = result + alphabet[i];
		}
		System.out.println(result);
	}

	private static void concatWithForEach(String[] alphabet) {
		System.out.println("Concating the alphabet using foreach:");
		String result = "";
		for (String currentLetter : alphabet) {
			result += currentLetter;
		}
		System.out.println(result);
	}

}
