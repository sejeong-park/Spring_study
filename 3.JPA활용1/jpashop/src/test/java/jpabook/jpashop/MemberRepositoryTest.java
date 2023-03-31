package jpabook.jpashop;

import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository; // memberRepository 주입을 받고
    
    @Test
    @Transactional // Test에 있으면 테스트가 끝난다음에 DB를 ROLLBACK 해버린다.
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member(); // member가 잘 저장되어있는 지 확인
        member.setUsername("memberA");

        //when
        Long saveId = memberRepository.save(member); // 저장
        Member findMember = memberRepository.find(saveId); // 얘가 맞는지 검증

        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(findMember).isEqualTo(member); // 인스턴스 비교 -> ㅆ겯
        System.out.println("findMember == Member : " + (findMember == member));
        // 같은 트랜잭션 안에서 저장하고 조회하면, "영속성 콘텍스트"가 똑같다.
        // 같은 영속성 콘텍스트는 ID값이 같으면 같은 Entity로 인식한다.
    }

}