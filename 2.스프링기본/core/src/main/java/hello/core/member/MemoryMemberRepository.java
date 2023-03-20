package hello.core.member;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemoryMemberRepository implements MemberRepository {
    // store는 해쉬
    private static Map<Long, Member> store = new HashMap<>(); //  실무에서는 동시성 이슈가 있을 수 있기 때문에 concurrent HashMap


    @Override
    public void save(Member member) {
        store.put(member.getId(), member); // id와 member 넣기
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
