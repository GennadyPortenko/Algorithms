package sorting;

public class BubbleSorting implements SortingAlgorithm {
  public String getName() { return "Bubble Sorting"; }
  public void sort(int[] array) {
    int k;
    // int count = 0;
    int lastRightPlacedIndex = array.length;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < lastRightPlacedIndex - 1; j++) {
        // count++;
        if (array[j] > array[j + 1]) {
          k = array[j];
          array[j] = array[j + 1];
          array[j + 1] = k;
          if (lastRightPlacedIndex - 1 == j + 1) {
            lastRightPlacedIndex--;
          }
        }
      }
    }
    // System.out.println("count : " + count);
  }
}
