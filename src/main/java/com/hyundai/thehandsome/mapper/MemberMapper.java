package com.hyundai.thehandsome.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hyundai.thehandsome.domain.member.Member;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
  * @Date    : 2023. 1. 31.
  * @FileName: MemberMapper.java
  * @작성자  : 박성환
  * @설명    : DateBase Member Mapper Interface
  */

@Mapper
public interface MemberMapper {
	Member findById(@Param("mId") String mId);

	@Select("select * from MEMBER ")
	public List<Member> findAll();

	void save(Member member);
}
