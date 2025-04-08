public class PracticeProblem {

public static void main(String args[]) {
	}

static int number2 = -1;
public static int towerOfHanoi(int number) {
		if (number < 3 && number2 == -1) {
		return -1;
		}
		number2 = number2 + 1;

		if (number == 1) {
		return 1;
		}
	return 2 * towerOfHanoi(number - 1) + 1;
	}
}
