package ch08Interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05TypeConversion {
  public static void main(String[] args) {
    Integer i = 3;

    Serializable s = i;

    Comparable<Integer> c = i;

    Constable ct = i;

    ConstantDesc cd = i;

    Number n = i;

    Object o = i;
  }
}
