# 트랜잭션이란?

- 데이터베이스의 상태를 변화시키기 위해서 수행하는 작업의 단위
- 간단하게, SQL를 이용하여 데이터베이스에 접근하는 것을 의미한다.
- SQL의 기본 4가지
    - SELECT
    - INSERT
    - DELETE
    - UPDATE
- 단, 작업의 단위는 한문장이 아니다. 사람이 어떠한 기능(게시판 기능, 회원가입 기능 등)을 사용할 때 여러가지의 SQL작업이 동시에 실행되는데 이러한 작업 단위를 하나의 **트랜잭션**이라고 한다. 개발자가 하나의 트랜잭션 설계를 잘하는 것이 데이터를 다루는 것에 많은 이점이 있다.

## 트랜잭션의 특징 4가지

- 원자성
    - 트랜잭션이 데이터베이스에 모두 반영되던가, 아니면 전혀 반영되지 않아야 한다.
- 일관성
    - 트랜잭션의 작업 처리 결과가 항상 일관성이 있어야 한다.
    - 트랜잭션이 진행되는 동안에 데이터베이스가 변경되더라도 변경된 데이터베이스가 아닌 처음 참조한 데이터베이스로 트랜잭션이 진행된다.
- 독립성
    - 둘 이상의 트랜잭션이 동시에 실행되고 있는 경우, 하나의 트랜잭션은 다른 트랜잭션 연산에 끼어들 수 없다.
    - 하나의 특정 트랜잭선이 완료될때까지, 다른 트랜잭션의 결과를 참조할 수 없다.
- 지속성
    - 트랜잭션이 성공적으로 완료되었을 경우, 결과는 영구적으로 반영되어야 한다.

## 트랜잭션의 Commit, Rollback 연산

### Commit

- 하나의 트랜잭션이 성공적으로 끝나고, 데이터베이스가 일관성있는 상태에 있을 때, 하나의 트랜잭션이 끝났다라는 것을 알려주기위해 사용하는 연산.

### Rollback

- 하나의 트랜잭션 처리가 비정상적으로 종료되어 트랜잭션의 원자성이 깨진 경우, 트랜잭션을 다시 시작하거나, 트랜잭션의 부분적으로만 연산된 결과를 취소한다.
- 사용자가 트랜잭션이 처리된 단위로 Rollback을 진행할 수도 있다.