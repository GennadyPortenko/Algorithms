package sorting;

public class InsertionSorting implements SortingAlgorithm {
  public String getName() { return "Insertion Sorting"; }
  public void sort(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int j = i;
      int k = array[j];
      while ( (j > 0) && (k < array[j - 1])) {
        array[j] = array[j - 1];
        j--;
      }
      array[j] = k;
    }
  }
}
