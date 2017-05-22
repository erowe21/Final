package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private RateDomainModel rdm;
	public RateException(RateDomainModel rdm){
		super();
		this.rdm = rdm;
	}
	
	public RateDomainModel getRateDomainModel(){
		return rdm;
	}
}