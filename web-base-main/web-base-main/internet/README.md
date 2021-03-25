## 인터넷

- 인터넷이 나온 목적은 사람과 사람 사이의 통신이며, 좀 더 구체적으로 말하면 컴퓨터와 컴퓨터 사이의 통신이다. 통신에는 전화, 편지 등과 같은 여러 방법들이 있는데 이런 방법들처럼 컴퓨터 사이의 통신 방법이다. 

- 컴퓨터와 컴퓨터가 통신하기 위해서는 보통 물리적인 선이 필요한데, 이를 케이블이라고 부른다. 즉, 두 대의 컴퓨터가 있고 두 대를 케이블을 통해 연결하면 두 대의 컴퓨터가 통신할 수 있는 상태가 된다. 하지만, 두 대의 컴퓨터만 연결하면 이와 같은 방법을 써도 무방하지만 수천만 개, 수억 개의 컴퓨터를 연결하기 위해서는 다른 방법이 필요하다. 

## router의 미사용 / 사용

### 미사용(여러 대의 컴퓨터가 통신하기 위해 케이블로 연결)

![not use router](https://mdn.mozillademos.org/files/8443/internet-schema-2.png)

### 사용

![use router](https://mdn.mozillademos.org/files/8445/internet-schema-3.png)

- 그러한 방법을 router라고 하며, 이를 사용함으로써 케이블의 수가 현저히 줄어들 뿐만 아니라 한 곳에서 관리할 수 있다.(즉, 복잡성이 매우 줄어든다.)

## router의 확장

![extend router](https://mdn.mozillademos.org/files/8447/internet-schema-4.png)

- 시간이 지남에 따라 수천 개 이상의 컴퓨터를 연결할 필요가 있는데 단일 router로는 이를 처리하기가 매우 어렵다. 그러므로 router과 router의 연결이 시작되었다.

## modem의 사용

![use modem](https://mdn.mozillademos.org/files/8451/internet-schema-6.png)

- 우리 지역의 router과 다른 지역 router를 연결하는데, 또는 다른 국가와 연결하기 위해 전세계에 퍼져있는 통신 장비가 필요했는데, 여기에 사용된게 전세계에 이미 충분히 보급된 전화 배선이다.
이 전화 배선을 통해 우리 지역 router의 연결이 가능한데, 여기서 router과 router의 연결을 도와주는 것을 modem이라고 하며, 이러한 modem과 기능을 제공하는 업체를 인터넷 서비스 공급자(Internet Service Provider, ISP)라고 한다.

![modem architecture](https://mdn.mozillademos.org/files/8453/internet-schema-7.png)

- ISP는 여러 곳이 있으며 우리가 사용하는 인터넷의 구조는 보통 위와 같다.

## Domain Name의 사용

![use domainname](https://mdn.mozillademos.org/files/8405/dns-ip.png)

- 인터넷을 통해 개인의 컴퓨터를 찾아가기위해서는 이게 내 컴퓨터다.라고 하는 주소가 필요한데, 이러한 고유 주소를 IP주소라고 한다. 
IP주소는 보통 점 4개로 구분된 숫자로 되어있는데, 사람의 입장에서 여러 개의 숫자로 구성된 주소보다는 글자로 되어있는 편이 기억하기도 쉽고 구분하기도 편하기에 domain name이라는 기술이 생겨나게 되었다.

## 인터넷과 웹

- 인터넷은 웹이다라고 생각하는 경우가 많지만 웹은 인터넷을 사용하며 나온 또다른 기술이며, 웹과 같은 인터넷 기술로는 이메일, IRC(전세계 채팅 )이 있다.

> [참고자료](https://developer.mozilla.org/ko/docs/Learn/Common_questions/How_does_the_Internet_work#%EB%8B%A8%EC%88%9C%ED%95%9C_%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC)
