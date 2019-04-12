import sorting.BubbleSorting;
import sorting.InsertionSorting;
import sorting.SortingAlgorithm;

public class SortingRunner {
    public static void main(String... args) {
        // SortingAlgorithm algorithm = new InsertionSorting();
        SortingAlgorithm algorithm = new BubbleSorting();

        System.out.println(algorithm.getName() + " : \n");
        int[] array = supplyArray();
        printArray(array);
        algorithm.sort(array);
        printArray(array);
    }

    private static int[] supplyArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf( "%3d ", array[i]);
        }
        System.out.println();
    }
}
