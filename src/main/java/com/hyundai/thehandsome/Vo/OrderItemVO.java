package com.hyundai.thehandsome.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderItemVO {
	
		private String psid; // 제품 재고 id
		private String oid; // 주문 번호
		private int oicount; // 각각의 상품 갯수
		private int oitotalprice; // 각각의 상품에 대한 가격
		
		private ProductDetailVO productDetail; // 상품 정보
	
}

