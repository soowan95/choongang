package ch15Collection.lectuer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06NestedList {
  public static void main(String[] args) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();
    List<Integer> row2 = new ArrayList<>();

    row1.add(9);
    row1.add(7);
    row1.add(5);

    row2.add(10);
    row2.add(20);

    list.add(row1);
    list.add(row2);

    int[] a = {1, 2};
    int[] b = {1, 2};

    System.out.println(Arrays.equals(a, b));
  }
}
