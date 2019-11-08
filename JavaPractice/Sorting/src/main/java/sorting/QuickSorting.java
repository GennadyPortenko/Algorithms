package sorting;

public class QuickSorting implements SortingAlgorithm {
  public String getName() { return "Quick Sorting"; }

  private int pivot;

  public void sort(int[] A) {
    sort(A, 1f);
  }

  public void sort(int[] A, float pivotRatio) {
    if (A.length == 0) return;
    sort(A, 0, A.length - 1, pivotRatio);
  }
  private void sort(int[] A, int low, int high, float pivotRatio) {
    if ((high - low) < 1)
      return;

    if (pivotRatio < 0 || pivotRatio > 1) {
      throw new IllegalArgumentException("Wrong pivot ratio value!");
    }

    pivot = Math.round(pivotRatio * (high - low) + low);
    int k;
    for (int i = low; i <= high; i++) {
      if (i < pivot) {
        if (A[i] >= A[pivot]) {
          k = A[i];
          A[i] = A[pivot - 1];
          A[pivot - 1] = A[pivot];
          A[pivot] = k;
          i--;
          pivot--;
        }
      } else if (i > pivot) {
        if (A[i] <= A[pivot]) {
          k = A[i];
          A[i] = A[pivot + 1];
          A[pivot + 1] = A[pivot];
          A[pivot] = k;
          pivot++;
        }
      }
    }
    sort(A, low, pivot - 1, pivotRatio);
    sort(A, pivot + 1, high, pivotRatio);
  }
}
