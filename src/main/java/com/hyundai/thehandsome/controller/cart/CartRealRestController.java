package com.hyundai.thehandsome.controller.cart;

import com.hyundai.thehandsome.Vo.UpdateCartCountReq;
import com.hyundai.thehandsome.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class CartRealRestController {

    private final CartService cartService;

    @PostMapping("/cart/updateCartCount")
    public HashMap<Object, Object> updateCartCount(@RequestBody UpdateCartCountReq updateCartCountReq) {
        cartService.updateCartCount(updateCartCountReq);
        HashMap<Object, Object> result = new HashMap<>();
        result.put("code", "0000");
        result.put("msg", "성공");
        result.put("data", "");
        return result;
    }

}
