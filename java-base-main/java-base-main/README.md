# java-base (프로젝트 하면서 배우기)

## Java를 배우는 이유

- 한번 작성하면 JVM(Java Virtual Machine)이 깔려있는 OS에서는 다 돌아간다.
- 객체 지향적인 언어이다. 차로 예를 들면 몸체, 바퀴, 엔진 등을 분리하여 만든다. 즉, 복잡한 소스코드를 나누어서 사용하기에 재사용, 유지 및 관리에 용이하다.
- 주로 백엔드(Spring), 안드로이드 앱 개발에 사용 (이쪽에 관심이 있다면 배워두는 것이 좋다.)
- 지속적으로 업데이트를 해주며 많은 라이브러리를 사용할 수 있기에 개발 속도가 빠르다.

## Optional

- null값이 포함될 가능성이 있는 경우 사용

> ex) Optional<type> 메소드명(파라메타);
  
## Annotation

- 의미 그대로 주석이란 뜻이며, 데이터의 유효성 검사 등을 쉽게 알 수 있고 다양한 목적이 있지만 메타데이터의 비중이 가장 크다.

- 메타 데이터 : 데이터를 위한 데이터를 의미하며, 풀어 이야기하면 한 데이터에 대한 설명을 의미하는 데이터(자신의 정보를 담고 있는 데이터).

### Annotation 종류 (사용해 본 것 위주로 정리)

* @Override 
  + 메서드 재정의
  + 만약 상위(부모) 클래스(또는 인터페이스)에서 해당 메서드를 찾을 수 없다면 컴파일 에러를 발생 시킴.

* @Test
  + 테스트 할 메서드에 붙여주면 해당 메서드를 실행해볼 수 있다.
  
* @AfterEach
  + 해당 클래스 안에서 하나의 메서드가 끝나면 실행되게 한다. (해당 기능을 사용하여 데이터의 중복을 방지할 수 있다.)
 
## Map

- javascript의 객체와 비슷. 키, 값으로 이루어진 자료형.

- keySet(), values()를 통해 키, 값의 데이터를 전부 가져옴.

- clear() 안쪽의 데이터를 지움(데이터 중복 방지 시 사용)

## Lambda

- 우선 간소화 방법이다. loop문에서는 ( 파라메타 -> 파라메타.(getter() or 메서드()) )의 식으로 사용이 가능하다.

- 간단한 예

```
// 기존 방식
for(Object obj : Object){
  //TODO
}

// lambda 방식
Object.forEach(obj -> {
  //TODO
});

// javascript에서 객체를 하나씩 가져올 때 많이 사용한 방법
```

### findAny()

- java8의 stream API이며, loop문을 돌며 해당 값을 찾을 경우 더이상 돌지 않고 해당 값을 반환한다. 없을 경우 null을 반환.

## 함수(function)와 메서드(method)

- 함수 : 함수란 이름으로 불러오는 코드 조각이다. 작동할 데이터(즉, 매개변수)를 전달할 수 있으며 선택적으로 데이터를 반환할 수 있다. 함수에 전달된 모든 데이터가 명시적(내용이나 뜻을 분명하게 드러내 보이는 것)으로 전달됩니다.

- 메서드 : 메서드란 객체와 연결된 이름으로 호출되는 코드 조각이다. 

대부분의 경우 아래 두 가지 주요 차이점을 제외하고 함수와 동일하다. 

1. 메서드는 호출한 객체에 암시적(내용이나 뜻이 숨겨져 있는 것)으로 전달된다. 

2. 메서드는 클래스 안에 포함된 데이터를 작동시킬 수 있다(객체는 클래스의 인스턴스임을 기억 - 클래스는 정의이고, 객체는 해당 데이터(클래스 안에 있는 모든 데이터)의 인스턴스이다).

### 심플하게 기억하는 방법

- **F**unction -> **F**ree (Free means not belong to an object or class)
- **M**ethod -> **M**ember (A member of an object or class)

> [위에 내용 참고사이트](https://stackoverflow.com/questions/155609/whats-the-difference-between-a-method-and-a-function)

# Try-with-Resources

- JDK 1.7부터 추가된 인터페이스

```java
//사용하기 전
SomeResource resource = null;
try {
    resource = getResource();
    use(resource);
} catch(...) {
    ...
} finally {
    if (resource != null) {
        try { resource.close(); } catch(...) { /* 아무것도 안 함 */ }
    }
}

//사용
try (SomeResource resource = getResource()) {
    use(resource);
} catch(...) {
    ...
}
```

try에 객체를 전달하면, try 코드 블록이 끝나면 자동으로 자원을 종료해주는 기능이다.
즉, 따로 finally 블록에 종료 처리를 하지 않아도 된다. [(참조)](https://ryan-han.com/post/java/try_with_resources/)

