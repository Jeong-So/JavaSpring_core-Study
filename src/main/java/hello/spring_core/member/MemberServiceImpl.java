package hello.spring_core.member;

// Impl : 인터페이스의 구현체가 하나만 있을경우 관례상 Impl을 붙여 표기

public class MemberServiceImpl implements MemberService{

    // 회원 가입 및 조회를 위해서는 memberRepository 인터페이스 필요
    // memberRepository 인터페이스만 가지고 있으면 nullpointException 남 --> 인터페이스의 구현체 선택해줘야함
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
