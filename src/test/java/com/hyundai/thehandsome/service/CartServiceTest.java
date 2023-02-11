package com.hyundai.thehandsome.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.hyundai.thehandsome.Vo.CartVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@Transactional
public class CartServiceTest {
	
	@Autowired
	private CartService cartService;
	
	@Test
	public void testInsert() {
		CartVO cart = new CartVO();
		cart.setMid("dev");
		cart.setPsid("SH2D1LJMT01M_DB_100");
		cart.setPquantity(2);
		cartService.cInsert(cart);
	}
	
	@Test
	public void testCSelectAll() {

	}

}
