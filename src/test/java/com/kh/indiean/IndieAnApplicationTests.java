package com.kh.indiean;

import com.kh.indiean.domain.user.model.Member;
import com.kh.indiean.domain.user.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IndieAnApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Test
	@DisplayName("Member 추가")
	void contextLoads() {
		Member member = new Member();
		member.setUserName("박혜성");
		member.setUserId("comet2667");

		Member result = memberRepository.save(member);
		System.out.println(result);
	}

}
