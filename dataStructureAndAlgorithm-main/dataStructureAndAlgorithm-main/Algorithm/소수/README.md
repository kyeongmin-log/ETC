# 소수
자신보다 작은 두 개의 자연수를 곱하여 만들 수 없는 1보다 큰 자연수

## 소수 구하기 알고리즘

### 내가 사용한 방법
```java
for(int i=2;i < 나눌값;i++){
  if(나눌값 % i == 0) {
    소수가 아님;
    return or break;
  }
  소수임;
  return true;
}
```

### 좀 더 효율적인 방법
```java
나눌값 = (int)Math.sqrt(나눌값);
for(int i=2; i <= 나눌값;i++){
  if(나눌값 % i == 0){
    소수가 아님;
    return or break;
  }
  소수임;
  return true;
}
```
