package hello.spring_core.member;

// 회원 가입 기능, 회원 조회 기능 두가지 기능 필요

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
