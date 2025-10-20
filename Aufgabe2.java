import java.util.Arrays;

public class Aufgabe2 {

    public int maxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public int minNumber(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public int maxSum(int[] numbers) {
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int minSum(int[] numbers) {
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
