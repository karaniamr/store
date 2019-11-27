package com.test.discount.service;

import org.springframework.stereotype.Service;

import com.test.discount.pojo.RequestMapper;
@Service
public class GenerateBill {

	public  double getFinalBill(RequestMapper req) {
		System.out.println("ITEM"+req.getItemType());
		GetDiscountFactory discountFactory = new GetDiscountFactory();  
		DiscountScheme discount=discountFactory.getDiscount(req.getUserType());
		discount.getRate();
		System.out.println("ITEM"+discount);
		double finalbill=discount.calculateBill(req.getBill(), req.getItemType());
		return finalbill;
		
	}
}
