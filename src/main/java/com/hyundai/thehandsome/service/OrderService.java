package com.hyundai.thehandsome.service;


import com.hyundai.thehandsome.domain.order.OrderRequest;
import com.hyundai.thehandsome.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrderService {

	private final OrderMapper orderMapper;

	// 회원 저장
	@Transactional(propagation = Propagation.REQUIRED)
	public synchronized int saveOrder(OrderRequest request) {
	//	int save = orderMapper.savePayment(request); // 무결성제어
	//	int save2 = orderMapper.saveItem(request);
		int save3 = orderMapper.save(request);

		if(  save3 == 1){
			return 1;
		}else{
			return 0;
		}
	}

}