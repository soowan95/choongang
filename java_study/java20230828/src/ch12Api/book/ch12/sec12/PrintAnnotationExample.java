package ch12Api.book.ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
  public static void main(String[] args) throws Exception {
    Method[] methods = Service.class.getDeclaredMethods();
    for (Method method : methods) {
      PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);
      printLine(annotation);
      method.invoke(new Service());
      printLine(annotation);
    }
  }

  public static void printLine(PrintAnnotation annotation) {
    if (annotation != null) {
      int number = annotation.number();
      for (int i = 0; i < number; i++) {
        String value = annotation.value();
        System.out.print(value);
      }
      System.out.println();
    }
  }
}
