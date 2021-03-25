# 소프트웨어 개발 생명 주기(Software Development Life Cycle)

소프트웨어를 개발하기위해 필요한 일들을 각 단계별로 나눈 것

- 각 단계별로 주요 활동 및 활동의 결과를 산출물로 표현한다.
- 특정 모델을 선택하여 사용하거나 개별적인 모델을 사용할 수 있다.

## 소프트웨어 개발 생명 주기 모델 종류

### 폭포수 모델 (Waterfall Model) - [참조](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrgmXS%2FbtqDvX69uSI%2F6IpmQi1KK6GGcbGcUk2bg1%2Fimg.png)

![Waterfall](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrgmXS%2FbtqDvX69uSI%2F6IpmQi1KK6GGcbGcUk2bg1%2Fimg.png)

분석, 설계, 개발/구현, 시험, 운영 및 유지보수 등 전 과정을 순차적으로 접근하는 개발 모델이다. 순차적으로 접근하며 단계별 검증을 진행한다.
검증 후 다음 단계로 진행한다.

- 장점
  - 고전적인 방법론으로써 사용한 프로젝트가 풍부하다.
  - 전체 과정을 이해하기 좋다.
  - 문서, 산출물의 관리와 적용이 쉽다.
- 단점
  - 병행 작업이 불가능하다.
  - 피드백을 통한 변경이 어렵다.
  - 테스트 단계에서 발견된 중요 결함에 대한 대응이 없다.
  - 고객 요구사항에 대한 상세한 반영이 어렵다.

### 프로토타입 모델 - [참조](http://blog.skby.net/%ED%94%84%EB%A1%9C%ED%86%A0%ED%83%80%EC%9D%B4%ED%95%91-%EB%AA%A8%EB%8D%B8-prototyping-model/)

![prototype](http://www.skby.net/blog/wp-content/uploads/2018/11/png-3.png)

사용자의 요구사항에 따라 프로토타입 제품을 신속하게 개발하여 제공한 후 사용자의 피드백을 통해 개선하고 보완해간다.

- 장점
  - 요구사항 반영하기에 좋다
  - 시스템 이해와 품질이 향상된다.
  - 개발자와 사용자 간의 의사소통이 원활하다.
- 단점
  - 사용자가 시제품을 최종완제품을 오해할 소지가 있음
  - 시제품 폐기 시 비경제적
  - 중간단계 산출물 문서화가 어렵다.

### 나선형 모델 - [참조](https://m.blog.naver.com/PostView.nhn?blogId=seilius&logNo=130185846022&proxyReferer=https:%2F%2Fwww.google.com%2F)

![Spiral](https://mblogthumb-phinf.pstatic.net/20140218_259/seilius_1392697072484Bg2UG_PNG/SpiralModel.png?type=w2)

시스템 개발 시 위험을 최소화하기 위해 반복적으로 완성도가 올라가는 시스템을 개발해나간다.

- 장점
  - 위험 관리 단계가 있기에 위험성이 큰 프로젝트를 수행할 수 있다.
  - 사용자의 요구사항을 보다 상세하게 반영할 수 있다.
  - 변경되는 요구사항 또한 적용이 가능하다.
  - 완성품에 대한 고객 만족도와 품질이 높다.
- 단점
  - 프로젝트의 기간이 상당히 길다.
  - 반복 단계가 길어질수록 프로젝트 관리가 힘들다.
  - 위험 관리가 중요하므로 '위험관리' 전문가가 필요하다. (많은 비용이 발생한다.)

## 애자일 방법론 - [참조](https://ko.wikipedia.org/wiki/%EC%95%A0%EC%9E%90%EC%9D%BC_%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4_%EA%B0%9C%EB%B0%9C)

애자일 방법론이란 어느 특정 개발 모델을 가리키는 말은 아니고 "애자일(Agile=기민한, 좋은것을 빠르고 낭비없게 만드는 것) 개발"을 가능하게 해 주는 다양한 모델들을 일컫는 말이다. 위에 있는 폭포수, 프로토타입, 나선형 모델과의 차이점은 문서를 통한 개발 방법이 아니라, 실질적인 코딩을 통한 방법론이라는 점이다.

따라서 애자일 개발 방법론은 계획을 통해서 주도해 나갔던 과거의 방법론과는 다르게 앞을 예측하며 개발을 하지 않고, 일정한 주기를 가지고 끊임없이 프로토 타입을 만들어내며 그때 그때 필요한 요구를 더하고 수정하여 하나의 커다란 소프트웨어를 개발해 나가는 adaptive style 이라고 할 수 있다.

애자일 방법론에 해당 하는 모델들은 대표적으로 XP(eXtreme Programming)이 있므며, 그 밖에도 스크럼, 칸반, Lean, 크리스탈, ASD, FDD, DSDM 등이 있다.

> [참조사이트](http://wiki.hash.kr/index.php/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4_%EA%B0%9C%EB%B0%9C%EB%B0%A9%EB%B2%95%EB%A1%A0)
