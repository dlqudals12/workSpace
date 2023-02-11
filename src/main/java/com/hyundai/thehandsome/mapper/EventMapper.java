package com.hyundai.thehandsome.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hyundai.thehandsome.domain.event.Event;

@Mapper
public interface EventMapper {
	Event findByName(String eCouponName);
}
