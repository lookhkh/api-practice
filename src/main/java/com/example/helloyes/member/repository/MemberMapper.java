package com.example.helloyes.member.repository;

import com.example.helloyes.member.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public void save(Member member);
}
