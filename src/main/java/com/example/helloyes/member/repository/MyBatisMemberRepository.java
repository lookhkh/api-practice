package com.example.helloyes.member.repository;

import com.example.helloyes.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyBatisMemberRepository implements MemberRepository {

    private final MemberMapper memberMapper;

    @Override
    public void save(Member member) {
        memberMapper.save(member);
    }
}
