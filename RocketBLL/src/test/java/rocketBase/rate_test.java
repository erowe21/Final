package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	@Test(expected = RateException.class)
	
	public void test1() throws RateException{
		int rate = 500;
		double x = RateBLL.getRate(rate);
		
		assertEquals(5.0, x, 0.01);
	}
	
	@Test
	
	public void test2() throws RateException{
		int rat = 600;
		double x = RateBLL.getRate(rat);
		
		assertEquals(6, x, 0.01);
	}
	
	@Test
	
	public void test3(){
		double pv = 300000;
		double fv = 0;
		double y = 360;
		double rate = 0.04/12;
		
		double pay = RateBLL.getPayment(rate, y, pv, fv, false);
		
		assertEquals(1432.25, pay, 0.01);
	}
}
