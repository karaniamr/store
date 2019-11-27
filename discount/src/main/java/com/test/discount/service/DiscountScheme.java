package com.test.discount.service;

public abstract class DiscountScheme {
	public double rate;  
	public abstract void getRate();  
	public double calculateBill(double bill, String getItemType){  
		if(!getItemType.equals("groceries")) {
			System.out.println("NOT groceries"+rate);
			double perDiscount=bill*rate/100;
			System.out.println("PERCENTAGE:"+perDiscount);
			int times = (int) (bill/100); 
			int onBill_discount=times*5;
			double finalBill=bill-perDiscount-onBill_discount;
			return finalBill;  
		}else {
			int times = (int) (bill/100); 
			int onBill_discount=times*5;
			double finalBill=bill-onBill_discount;
			return finalBill;  
		}
		
	}  
}
