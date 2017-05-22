package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void test(){
		ArrayList<RateDomainModel> r = RateDAL.getAllRates();
		System.out.println("Size of rates =" + r.size());
		assertTrue(r.size() > 0);
	}
}