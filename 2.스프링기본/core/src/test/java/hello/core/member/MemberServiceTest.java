package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

//    MemberService memberService = new MemberServiceImpl(); -> AppConfig에서 실행할 수 있돋록

    MemberService memberService;

    @BeforeEach // test 실행 전에 무조건 실행하도록 하는 것
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        // 검증 -> Assertions
        Assertions.assertThat(member).isEqualTo(findMember);

    }



}
