package com.ohgiraffers.thymeleaf.controller;

import com.ohgiraffers.thymeleaf.model.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lecture")
public class LectureController {

    @GetMapping("/expression")
    public ModelAndView expression(ModelAndView mv) {

        mv.addObject("member", new MemberDTO("서정민", 20, '여', "경기도 고양시"));

        mv.addObject("hello", "hello <h3>thymeleaf!!<h3>");

        mv.setViewName("lecture/expression");

        return mv;

    }

    @GetMapping("/conditional")
    public ModelAndView conditional(ModelAndView mv) {

        mv.addObject("num", 1);
        mv.addObject("str", "바나나");

        List<MemberDTO> memberList = new ArrayList<>();
        memberList.add(new MemberDTO("홍길동", 20, '남', "서울시 노원구"));
        memberList.add(new MemberDTO("유관순", 16, '여', "서울시 도봉구"));
        memberList.add(new MemberDTO("장보고", 20, '남', "서울시 노진구"));
        memberList.add(new MemberDTO("신사임당", 20, '여', "서울시 영구"));

        mv.addObject("memberList", memberList);

        Map<String, MemberDTO> memberMap = new HashMap<>();
        memberMap.put("m01", new MemberDTO("홍길동", 20, '남', "서울시 도봉구"));
        memberMap.put("m02",new MemberDTO("유관순", 16, '여', "서울시 노진구"));
        memberMap.put("m03",new MemberDTO("홍길동", 20, '남', "서울시 길구봉구"));
        memberMap.put("m04",new MemberDTO("홍길동", 20, '여', "서울시 백구"));

        mv.addObject("memberMap", memberMap);

        return mv;

    }

}
