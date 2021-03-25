package spring.backend.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import spring.backend.domain.Member;
import spring.backend.repository.MemberRepository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    void 회원가입() {
        //given : 무언가의 상황이 주어지고
        Member member = new Member();
        member.setName("spring");
        //when : 이것(//when 아래의 명령문)을 실행,검증 했을 때
        Long saveId = memberService.join(member);
        //then : 결과
        Member findMember = memberService.findOne(saveId).get();
        assertThat(findMember.getId()).isEqualTo(member.getId()); // NOPMD by pytha on 21. 1. 11 오후 3:48
    }

    @Test
    public void 중복_회원_예외(){
        //given
        Member member = new Member();
        member.setName("spring");
        Member member2 = new Member();
        member2.setName("spring");
        //when
        memberService.join(member);
        //then
        //하나의 명령문을 예외 처리할 때는 아래와 같은 방법을 사용하는 것이 좋다.
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));//해당 에러가 나오면 테스트를 통과. 안
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}
