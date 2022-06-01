package groupProject01;

public class Task09 {

	public static void main(String[] args) {

		// Task 9: Maximum and minimum number in the array?

		int[] numbers = { 8, 907, 15, 62, 5, 156, 2736 };

		int maxNum = 0;
		int minNum = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (maxNum < numbers[i]) {
				maxNum = numbers[i];
			}
		}
		System.out.println("The maximum number in 'numbers' array is " + maxNum);

		for (int i = 0; i < numbers.length; i++) {
			if (minNum > numbers[i]) {
				minNum = numbers[i];
			}
		}

		System.out.println("The minimum number in 'numbers' array is " + minNum);
	}

}
