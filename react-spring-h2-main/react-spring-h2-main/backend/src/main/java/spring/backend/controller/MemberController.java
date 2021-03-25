package spring.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.backend.domain.Member;
import spring.backend.repository.JpaMemberRepository;
import spring.backend.service.MemberService;

import java.util.Date;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/api/members/create")
    public String MemberCreate(Member member) {
        memberService.join(member);

        return "redirect:http://localhost:3000";
    }

    @GetMapping("api/members")
    @ResponseBody
    public Object MemberRead(){
        return memberService.findMembers();
    }

    @PostMapping("/api/members/login")
    public String MemberLogin(Member member){
        if(memberService.findName(member.getName()).isPresent()){
            return "redirect:http://localhost:3000/board";
        }
        else{
            return "redirect:http://localhost:3000/login";
        }
    }

    //데이터 주고 받기 테스트
    @GetMapping("/api/time")
    @ResponseBody
    public String time(){
        return "현재 서버시간은 "+new Date() + "입니다. \n";
    }

}
