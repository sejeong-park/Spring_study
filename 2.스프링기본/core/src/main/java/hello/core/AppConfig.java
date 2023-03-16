package hello.core;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;

// 애플리케이션에 대한 환경 구성
public class AppConfig {

    public MemberService memberServie() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }


}
