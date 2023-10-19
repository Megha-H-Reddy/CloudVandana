import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Random rand = new Random();

        // Fisher-Yates shuffle algorithm
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // Print the shuffled array
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
