package ch08Interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C09Cast {
  public static void main(String[] args) {
    CharSequence c = "java";

    String s = (String) c;
    Object o = (Object) c;
    Serializable se = (Serializable) c;
    Comparable co = (Comparable) c;
    Constable con = (Constable) c;
    ConstantDesc cd = (ConstantDesc) c;

//    Number n = (Number) c; // 런타임 오류

    System.out.println("프로그램 종료");
  }
}

