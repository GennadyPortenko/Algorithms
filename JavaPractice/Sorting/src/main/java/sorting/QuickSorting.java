package sorting;

public class QuickSorting implements SortingAlgorithm {
  public String getName() { return "Quick Sorting"; }
  public void sort(int[] A) {
    sort(A, 0, A.length - 1);
  }
  private void sort(int[] A, int low, int high) {
    if ((high - low) < 1)
      return;
    int chosenPos = high;
    int k;
    for (int i = low; i < chosenPos; i++) {
      if (A[i] >= A[chosenPos]) {
        if (i == chosenPos - 1) {
          k = A[chosenPos];
          A[chosenPos] = A[i];
          A[i] = k;
        } else {
          k = A[i];
          A[i] = A[chosenPos - 1];
          A[chosenPos - 1] = A[chosenPos];
          A[chosenPos] = k;
        }
        i--;
        chosenPos--;
      }
    }
    sort(A, low, chosenPos - 1);
    sort(A, chosenPos + 1, high);
  }
}
