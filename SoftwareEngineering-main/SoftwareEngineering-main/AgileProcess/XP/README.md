# 익스트림 프로그래밍(eXtreme **P**rogramming, XP)

켄트 백 등이 제안한 소프트웨어 개발 방법이다. 애자일 개발 프로세스라 불리는 개발 방법 중의 대표적인 하나로 꼽히며, 약칭인 'XP'로 잘 알려져 있다.

## 목적

고객이 원하는 양질의 소프트웨어를 빠른 시간 안에 전달

## 익스트림 프로그래밍 로드맵

![roadmap](https://web.archive.org/web/20061012035732im_/http://www.xprogramming.com/images/circles.jpg)

[파란원]

- _SimpleDesign_ : 단순한 디자인.
- _PairProgramming_ : 프로그램 코드를 두명이 하나의 컴퓨터에서 작성한다.
  단순한 1+1 = 2의 차원이 아닌 여러 시너지 효과를 발휘할 수 있다.
  PariProgramming을 하면서 상대방에게 더 많은 것을 배울 수 있으며, 작업 집중력이 높아진다.
- _TestDrivenDevelopment_ : 코드를 작성하기 전에 프로그래머가 하려는 일(뭘 할건지, 목적)을 표현하는 테스트 코드를 먼저 작성하고,
  그 다음 이를 만족시키는 코드를 작성한다.

  이로서 좋은 디자인의 코드를 만들어주며, 추후 리펙토링 시 테스트 코드들이 일종의 보호막이 되어준다.

- _ReFactoring_ : 리펙토링은 '외부로 노출되는 기능의 변화없이 내부의 코드 디자인, 구조를 개선시키는 행위'를 의미한다.

  리펙토링을 프로그래밍 중 지속적으로 해줌으로서 디자인을 점진적으로 향상시켜나가고,
  코드의 엔트로피(쉽게 말하면 중복 제거로 인한 코드 길이의 짧아짐 등의 전체적인 코드의 정보량)를 낮춰준다.

[초록원]

- _Coding Standard_ : 팀 프로젝트 시 표준 코딩 스타일(모듈 화일, 클래스, 메소드 등의 작명법 등)의 적용은 Collective Ownership 을 돕는다.
- _Continuous Integration_ : Integration(개별작업 산출물들에 대한 통합작업)을 지속적으로 자주 해준다. 이는 항상 늘 시스템의 최신 버전을 가지고 작업할 수 있도록 해주며, Collective Ownership 을 돕고, 개발자들의 타 개발자들이 작성한 코드의 재사용을 도와, 코드로 대화를 하게끔 도와준다.
- _Collective Ownership_ : 코드에 대한 개인 소유권이 없이 팀 내의 모든 사람들이 코드에 대해 수정할 수 있는 권리를 가지며, 자류롭게 수정한다. Collective Ownership 은 리펙토링, PariProgramming, Coding Standard 등이 지켜지는 경우 더욱 효과적이다.
- _Sustainable Pace_ : 40-hour week. (꼭 주당 40시간은 아니더라도) 당신의 팀에 맞는 최적의 리듬을 찾아라.
- _Metaphor_ : 아키텍처는 시스템에 대한 다양한 컴포넌트들에 대한 밑그림을 제공해주며, 각 컴포넌트들이 어떻게 상호작용하는지 보여준다. 개발자는 이를 일종의 청사진으로 이용할 수 있다.

  XP 에서의 System metaphor 는 다른 방법론들이 'architecture' 라 부르는 것들과 유사하다. System metaphor 는 팀에게 현재의 시스템이 작동하는 방법과 새로 작성된 부분들과 기존시스템과의 인터페이스에 대한 일관된 밑그림을 제공해준다.
  팀내 구성원들이 어떻게 시스템들이 적절히 상호작용하며 구현되는지 이해할 수 있어야 한다. 이는 metaphor를 어떻게 아름다운 어휘를 쓰느냐 ('은유'라는 뜻으로 볼때)보다 중요하다.

[빨간원]

- _whole Team_ : 스토리를 명확하게 해주고, 중요한 비즈니스 결정 사항에 대해 명확한 답을 제공해주는 고객의 역활은 중요하다. XP에서는 고객이 늘 개발현장에 같이 참여하기 원한다.
- _Small Releases_ : Release를 짧게 자주한다. 그렇게함으로써 고객과의 대화를 자주 할 수 있고, 명확하지 않은 사항에 대해 빠른 피드백을 받음으로써 프로젝트의 방향이 어긋나는 일을 줄일 수 있다.
- _Customer Tests_ : 고객의 입장에서 해당 [고객요구사항](https://web.archive.org/web/20061012050622/http://xper.org/wiki/xp/UserStory)의 통과함을 입증해주는 자동화 테스트를 작성한다. [AcceptanceTest](https://web.archive.org/web/20061012045150/http://xper.org/wiki/xp/AcceptanceTest)는 고객이 개발자의 도움을 받아서 작성할 수 있다.
- _Planning Game_ : [StandUpMeeting](https://web.archive.org/web/20061012045122/http://xper.org/wiki/xp/StandUpMeeting), [ReleasePlanning](https://web.archive.org/web/20061012045300/http://xper.org/wiki/xp/ReleasePlanning)

> [참고사이트](https://web.archive.org/web/20061012033825/http://xper.org/wiki/xp/_b4_eb_b9_ae)
