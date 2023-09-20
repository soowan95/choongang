package ch12Api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyAnnotation29
public class C29Annotation {

  @MyAnnotation29
  int field;

  @MyAnnotation29
  public static void main(@MyAnnotation29 String[] args) {

    @MyAnnotation29
    int local;
  }
}

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.TYPE})
@interface MyAnnotation29 {

}