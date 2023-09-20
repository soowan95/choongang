package ch12Api.lecture;

public class C35Annotation {

  @MyAnnotation35(name = {"son", "lee"})
  int field;

  @MyAnnotation35(name = {"son"})
  int field2;

  @MyAnnotation35(name = "son")
  int field3;
}

@interface MyAnnotation35 {

  String[] name();
}