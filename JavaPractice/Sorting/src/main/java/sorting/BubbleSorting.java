package sorting;

public class BubbleSorting implements SortingAlgorithm {
  public String getName() { return "Bubble Sorting"; }
  public void sort(int[] array) {
    int k;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          k = array[j];
          array[j] = array[j + 1];
          array[j + 1] = k;
        }
      }
    }
  }
}
