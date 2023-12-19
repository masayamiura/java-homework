public class FizzBuzz {
	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		int max = Integer.parseInt(args[0]);
		String result = null;
		for (int i = 1; i <= max; i++) {
			result = "";
			if (i % 3 == 0) {
				result = result + "Fizz";
			}
			if (i % 5 == 0) {
				result = result + "Buzz";
			}
			if (result.length() == 0) {
				result = result + i;

			}
			System.out.print(result + " ");
		}
	}
}
