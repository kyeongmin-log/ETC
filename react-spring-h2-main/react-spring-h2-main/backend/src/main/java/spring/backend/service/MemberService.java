package spring.backend.service;

import org.springframework.stereotype.Service;
import spring.backend.domain.Member;
import spring.backend.repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    public Long join(Member member){
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //전체 회원 조회
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    //단일 회원 아이디 조회
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

    //단일 회원 이름 조회
    public Optional<Member> findName(String memberName){
        return memberRepository.findByName(memberName);
    }

}
