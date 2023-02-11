package com.hyundai.thehandsome.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailVO {
	
		   private String bname; // 브랜드명
		   private String pname; // 물품명	      
		   private String pccolorcode; // 물품색테이블 색상
		   private String pcimg1; // 물품색테이블 이미지 1개
		   private int pcprice; // 물품색테이블 판매가격	      
		   private String psize; // 물품재고테이블 사이즈
		
}