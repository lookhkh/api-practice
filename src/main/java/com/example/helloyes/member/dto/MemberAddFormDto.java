package com.example.helloyes.member.dto;
import com.example.helloyes.member.entity.Member;
import lombok.Data;

@Data
public class MemberAddFormDto {

    private String memberName;
    private Integer memberAge;

    public static Member MemberAddFormDtoToMember(MemberAddFormDto memberAddFormDto){
        Member member = new Member();
        member.setMemberName(memberAddFormDto.getMemberName());
        member.setMemberAge(memberAddFormDto.getMemberAge());
        return member;
    }
}
