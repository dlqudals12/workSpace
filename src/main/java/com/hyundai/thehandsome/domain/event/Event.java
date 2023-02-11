package com.hyundai.thehandsome.domain.event;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
	private Integer eNo;

	private String eTitle;

	private String eContent;

	private Date eIssueDate;

	private Date eExprieDate;
	
	private Integer eLimitCount;

	private Integer eCount;

	private String eImg;

	private Integer eDiscount;

	private Integer eStatus;

	private String eDetailImg;

	private String eCouponTitle;
	
	private String cPid;

}
