package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();

		for (RateDomainModel rate : rates){
			if (rate.getiMinCreditScore() <= GivenCreditScore){
				dInterestRate = rate.getdInterestRate();
			}
			if (dInterestRate == 0){
				RateDomainModel Rdm = new RateDomainModel();
				Rdm.setiMinCreditScore(GivenCreditScore);
				throw new RateException(Rdm);
			}
		}
		return dInterestRate;
	}

	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
