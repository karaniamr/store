package com.test.discount;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.test.discount.pojo.RequestMapper;
import com.test.discount.service.GenerateBill;
@RunWith(MockitoJUnitRunner.class)
public class GenerateBillTest {
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
	@Test
	public void getFinalBill() {
		List<RequestMapper> list = new ArrayList<RequestMapper>();
		RequestMapper req1=new RequestMapper();
		req1.setBill(200);
		req1.setUserType("STOREEMPLYEE");
		req1.setItemType("groceries");
		
		RequestMapper req2=new RequestMapper();
		req2.setBill(100);
		req2.setUserType("STOREEMPLYEE");
		req2.setItemType("groceries");
		list.add(req1);
		list.add(req2);
		double value=2;
		GenerateBill generateBill = mock(GenerateBill.class, Mockito.RETURNS_DEEP_STUBS);
		when(generateBill.getFinalBill(list.get(0))).thenReturn(value);
	}
	

}
