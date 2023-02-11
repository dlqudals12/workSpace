package com.hyundai.thehandsome.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.hyundai.thehandsome.Vo.CartVO;
import com.hyundai.thehandsome.mapper.CartMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@Transactional
public class CartMapperTest{
	
	@Autowired
	private CartMapper cartMapper;
	
	  @Test
	    public void selectListTest() {
	        String mid = "dev";
	        List<CartVO> result = cartMapper.selectList(mid);
	        assertNotNull(result);
	    }
	
	@Test
	public void insertTest() {
		CartVO cart = new CartVO();
		cart.setMid("dev");	// pf
		cart.setPsid("SH2D1LJMT01M_NY_95");  // fk - product_stock
		cart.setPquantity(1);
		cartMapper.insert(cart);
	}
	
	@Test
	public void testselectList() {
		cartMapper.selectList("dev")
		.forEach(mapper -> log.info(mapper.toString()));
	}
	
//	
	@Test
	public void testDelete() {
		cartMapper.delete("dev", "SH2D1NJMT04M_BL_95"); // fk 멤버테이블에 이 값이 있어야함, product_stock 테이블이 이 값이 있어야함
	}
	
	
	// update
	@Test
	public void testUpdate() {
		cartMapper.update("dev", "SH2D1NOTT01M_TP_95", 99, "100", "#cbcbcb");  
	}

}