## HTTP란
- HTTP(Hyper Text Transfer Protocol)란 인터넷에서 데이터를 주고받을 수 있는 프로토콜이다. 프로토콜은 원활한 통신을 위한 규칙이다.

## HTTP 동작
- 지금 우리가 보고 있는 웹페이지가 그냥 만들어진게 아니다. 
https://github.com을 보면 github.com라는 url에 정보를 요청하고 받아온 정보를 표시해주는 형태이다.
이때 사용되며 앞 부분에 http(s)가 붙어있는 것을 확인할 수 있다.

![HTTP use](https://miro.medium.com/max/537/0*hW_4GS0xOBqMyPto.png)

- 보통 인터넷에서 뉴스 기사를 확인하고 쇼핑몰에 방문하는 일상 속에서 우리가 직접 HTTP에 따라 행동하진 않는다. 사용자는 URL만 알면 된다. 
브라우저 주소창에 URL을 입력하여 데이터를 요청하면 보여주는 것은 브라우저의 몫이고, 
요청받은 데이터를 가져오는 것은 웹 서버의 역할이며 HTTP는 바로 그 클라이언트와 서버 간의 규칙이다. 
이때 클라이언트의 요청을 HTTP Request, 서버의 응답을 HTTP Response라고 한다.

_(클라이언트는 브라우저가 아닌 그 무엇이라도 될 수 있다.)_

## HTTPS 란
- HTTP가 무엇인지 알았지만 최근 URL을 보면 다 HTTPS로 되어있는 걸 볼 수 있다.

![HTTPS](https://miro.medium.com/max/400/0*5R3hPxUocN2Wetyo.png)

- HTTPS(Hypertext Transfer Protocol Secure)란 쉽게 말해 HTTP의 확장 버전이다. 
‘Secure’이란 말에서 유추할 수 있듯 HTTP를 통한 데이터의 보안을 위한 조치가 추가되었고, 이때 사용되는 것이 SSL(Secure Sockets Layer) 프로토콜이다. 
HTTP와 HTTPS의 차이점은 SSL을 사용해 데이터를 한쪽에서 다른 한 쪽으로 안전하게 보낼 수 있는지 여부이다.

![HTTPS SSL](https://miro.medium.com/max/700/0*PREYLnyPRLSCTPXd.gif)

- 위 그림을 보면, HTTP를 통해 주고받는 데이터는 plain text, 즉 평문으로 되어있어 중간에 누군가 데이터를 알아볼 가능성이 크다. 
반면 HTTPS에서는 데이터가 암호화되기에 누군가 끼어들어 데이터를 가져가도 큰 쓸모가 없다. 
즉, HTTPS는 비밀번호 등 민감한 정보들이 유출되어 악용되는 것을 방지한다.

> [참고자료](https://medium.com/@lunay0ung/protocol-http%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C-84a896c5fc93)
