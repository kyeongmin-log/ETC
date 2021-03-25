# Queue(큐)란?

큐는 기본적으로 먼저 넣은 데이터가 먼저 나오는 FIFO(First In First Out)구조를 가지고 있다.

현실에서 보자면 가게에서 줄을 선 상황을 볼 수 있으며, 줄을 먼저 선 사람이 주문을 먼저 한다.

그림으로 보자면

![queueImg](https://media.vlpt.us/images/sbinha/post/dbc199b3-6959-464e-872d-39c503fa0b1b/Screenshot%202020-04-20%2019.19.59.png)

Enqueue로 데이터를 집어넣고 Dequeue로 데이터를 내보낸다. Push(Enqueue), Pop(Dequeue) 으로도 많이 쓰며, 배열과 연결리스트로 구현이 가능하다.

# Stack(스택)이란?

스택은 큐와는 다르게 가장 나중에 넣은 데이터가 먼저 나오는 LIFO(Last In First Out)구조를 가지고 있다.

현실에서 보자면 쟁반이나 그릇, 메세지함의 메세지 등이 있다. 기본적으로 가장 최신 것이 맨 위로 오며, 나갈 때도 맨 위에 있는 데이터를 가져온다.

그림으로 보자면

![stackImg](https://media.vlpt.us/images/sbinha/post/17a3cf61-fb95-4970-b66c-92a71b99846b/Screenshot%202020-04-20%2019.07.55.png)

Push, Pop을 통해 데이터를 넣다 뺏다 할 수 있다. 배열과 연결리스트로 구현이 가능하다.

> [참고사이트](https://www.boostcourse.org/cs112/lecture/119044)
