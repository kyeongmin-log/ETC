# 알고리즘이란?

알고리즘은 입력(input)에서 받은 자료를 출력(output)형태로 만드는 처리 과정을 말한다.

![algorithm](https://cphinf.pstatic.net/mooc/20200607_61/1591525709658RVdvU_PNG/mceclip3.png)

즉, 알고리즘이란 입력값을 출력값의 형태로 바꾸기 위해 어떤 명령들이 수행되어야 하는지에 대한 규칙들의 순서적 나열입니다.

알고리즘을 적용할 때는 정확도도 중요하지만 효율적인 면도 중요하다.

순서가 있는 책(옛날 전화번호부, 사전 등)에서 원하는 단어를 찾을 때,
한장씩, 두장씩 넘겨가며 꼼꼼히 보는 것도 중요하지만 시간이 너무 오래 걸린다.

가운데를 펼치고 원하는 단어가 앞쪽에 있다면 과감하게 뒷부분을 버린다.

나머지에서 또 가운데를 펼치고 원하는 단어가 있는 곳을 남겨두고 나머지 반은 버린다.

이런 식으로 찾다보면 정확성을 물론이고 더욱 효과적으로 내가 원하는 단어를 찾을 수 있다.

# 의사코드

위와 같은 알고리즘은 아래와 같은 의사코드라는 방식으로 보다 명료하게 정리할 수 있다.

의사코드는 필요한 행동이나 조건을 잘 설정하여 컴퓨터가 수행해야 하는 일을 절차적으로 파악할 수 있게 도와준다.

![code](https://cphinf.pstatic.net/mooc/20200608_180/1591579125976fF0NI_PNG/mceclip0.png)

> 번역

1.전화번호부를 집어 든다

2.전화번호부의 중간을 편다

3.페이지를 본다

4.만약 Mike Smith가 페이지에 있으면

5.    Mike Smith에게 전화한다.

6.그렇지 않고 만약 Mike Smith가 앞 페이지에 있으면

7.    앞 페이지의 절반을 편다

8.    3번째 줄부터 다시 실행한다

9.그렇지 않고 만약 Mike Smith가 뒷 페이지에 있으면

10.    뒷 페이지의 절반을 편다

11.    3번째 줄부터 다시 실행한다

12.그러지 않으면

13.    그만둔다

> [참고 사이트](https://www.boostcourse.org/cs112/lecture/118999)
