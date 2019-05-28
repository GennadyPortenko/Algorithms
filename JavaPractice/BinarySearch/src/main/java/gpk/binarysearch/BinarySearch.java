package gpk.binarysearch;

import java.util.Arrays;
import java.util.Optional;

public class BinarySearch {
    private static Optional<Integer> search(int[] data, int searchValue, int startPos, int endPos) {
        int length = endPos - startPos + 1;
        int middlePos = startPos + length/2 - 1;
        if (middlePos < 0)
            middlePos = 0;
        if (data[middlePos] == searchValue ) {
            return Optional.of(middlePos);
        } else {
            if (length == 1)
                return Optional.empty();
            if (searchValue < data[middlePos]) {
                return search(data, searchValue, startPos, middlePos);
            } else {
                return search(data, searchValue, middlePos + 1, endPos);
            }
        }
    }
    public static Optional<Integer> search(int[] data, int searchValue) {
        return search(data, searchValue, 0, data.length - 1);
    }

    public static void main() {
    }
}
