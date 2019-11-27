package com.test.discount.service;

public class GetDiscountFactory {
	  public DiscountScheme getDiscount(String userType){
		  System.out.println("DATA IS UP:"+userType);
        if(userType.equalsIgnoreCase("STOREEMPLYEE")) {  
        	System.out.println("DATA IS ");
               return new StoreEmployee();  
             }   
         else if(userType.equalsIgnoreCase("AFFILIATE")){  
              return new Affiliate();  
          }   
        else if(userType.equalsIgnoreCase("TIMEBASED")) {  
              return new TimeBased();  
        }else if(userType.equalsIgnoreCase("OTHER")) {  
            return new Other();  
      }else {
    	  return new Other();
      }
 } 
}
