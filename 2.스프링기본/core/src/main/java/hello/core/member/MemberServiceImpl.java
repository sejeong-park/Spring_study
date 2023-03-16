package hello.core.member;

public class MemberServiceImpl implements MemberService{
    // MemberServiceImple에서 회원 가입하고, 조회하려면
    // MemberRepository에서 만들었던 구현 객체를 선언해야 한다.

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
