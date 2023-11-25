package com.example.helloyes.member.controller;

import com.example.helloyes.member.dto.MemberAddFormDto;
import com.example.helloyes.member.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// html -> (GET)

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/add")
    public String goToAddMember(){
        return "members/addForm";
    }

    @PostMapping("/add")
    public void addMember(@ModelAttribute  MemberAddFormDto memberAddFormDto){
        Member member = MemberAddFormDto.MemberAddFormDtoToMember(memberAddFormDto);

    }

}
