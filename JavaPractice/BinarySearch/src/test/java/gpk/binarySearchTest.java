package gpk;

import gpk.binarysearch.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.Optional;

@RunWith(BlockJUnit4ClassRunner.class)
public class binarySearchTest {

  private int[] data;
  final int DATA_SIZE = 100;
  final int MAX_VALUE = 1000;

  @Before
  public void init() {

    data = new int[DATA_SIZE];
    for (int i = 0; i < data.length; i++) {
      data[i] = Double.valueOf(Math.random() * MAX_VALUE).intValue();
    }
    Arrays.sort(data);
  }

  @Test
  public void testValueFound_whenValueIsPresent() {
    int searchPos = 15;
    int searchValue = data[searchPos];
    Assert.assertEquals(Optional.of(searchPos), BinarySearch.search(data, searchValue));

    searchPos = 45;
    searchValue = data[searchPos];
    Assert.assertEquals(Optional.of(searchPos), BinarySearch.search(data, searchValue));

    searchPos = 70;
    searchValue = data[searchPos];
    Assert.assertEquals(Optional.of(searchPos), BinarySearch.search(data, searchValue));

    searchPos = 90;
    searchValue = data[searchPos];
    Assert.assertEquals(Optional.of(searchPos), BinarySearch.search(data, searchValue));
  }

  @Test
  public void testValueNotFound_whenValueIsMissing() {
    int searchValue = MAX_VALUE + 1;
    Assert.assertEquals(Optional.empty(), BinarySearch.search(data, searchValue));

    searchValue = -1;
    Assert.assertEquals(Optional.empty(), BinarySearch.search(data, searchValue));
  }


}
