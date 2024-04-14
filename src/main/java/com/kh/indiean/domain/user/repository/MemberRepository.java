package com.kh.indiean.domain.user.repository;

import com.kh.indiean.domain.user.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
