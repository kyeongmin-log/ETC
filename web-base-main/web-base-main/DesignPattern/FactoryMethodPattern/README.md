# 팩토리 메서드 패턴이란?

- 객체를 만드는 부분을 Sub class에 맡기는 패턴

# 코드로 이해

```java
//Shape.java
//Shape 인터페이스
public interface Shape {
  void draw();
}
```

```java
//Circle.java
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.print("Circle - draw() Method.");
  }
}
```

```java
//Rectangle.java
public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.print("Rectangle - draw() Method.");
  }
}
```

```java
//Square.java
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.print("Square - draw() Method.");
  }
}
```

```java
//ShapeFactory.java
public class ShapeFactory {
  //팩토리 메소드 - 객체 생성 후 반환
  public Shape getShape(String shapeType){
    switch(shapeType.toUpperCase()) {
      case "CIRCLE" :
        return new Circle();
      case "RECTANGLE" :
        return new Rectangle();
      case "SQUARE" :
        return new Square();
      default :
        return null;
    }
  }
}
```

# TestCase

```java
//FactoryPatternTest.java
public class FactoryPatternTest {
    public static void main(String[] args) {
      //팩토리 클래스에서 객체를 생성 후 반환
      ShapeFactory shapeFactory = new ShapeFactory();
 
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      //Circle 메소드 호출
      shape1.draw();
 
      Shape shape2 = shapeFactory.getShape("RECTANGLE");
      //Rectangle 메소드 호출
      shape2.draw();
 
      Shape shape3 = shapeFactory.getShape("SQUARE");
      //Square 메소드 호출
      shape3.draw();
    }
}
```

# 그림으로 이해하기

![factory](https://t1.daumcdn.net/cfile/tistory/99DAB6505B0264CB2F)

# 정리

- 코드와 그림으로 본 것처럼 메소드를 정의하는 클래스를 따로 두고 
하위 클래스에서 정의한 메소드를 구현하는 패턴이다.
인터페이스 위주로 관리하면 되므로 객체 생성에 관한 확장이 쉽다는 장점이 있다.

> 참고사이트
- https://niceman.tistory.com/143
