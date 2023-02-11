package com.hyundai.thehandsome.controller.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.hyundai.thehandsome.Vo.CartVO;
import com.hyundai.thehandsome.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
    
	@Autowired
	private CartService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(Model model) {
    	String mid = "dev";
    	
    	List<CartVO> cartList = service.cSelectAll(mid);
		int i = 0;
		for (CartVO cartVO : cartList) {
			cartVO.setIndex(i);
			i+=1;
		}
    	model.addAttribute("cartlist", cartList);
    	
        return "cart/cart";
    }

    
	
}