package ch12Api.lecture;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class C30Annotation {

  @Override
  public String toString() {
    return super.toString();
  }

  public static void main(String[] args) throws NoSuchMethodException {
    Class<C30Annotation> c1 = C30Annotation.class;
    Method method1 = c1.getDeclaredMethod("toString");
    System.out.println("method1.getName() = " + method1.getName());

    Annotation[] a = method1.getDeclaredAnnotations();
    System.out.println("a.length = " + a.length);
  }
}
