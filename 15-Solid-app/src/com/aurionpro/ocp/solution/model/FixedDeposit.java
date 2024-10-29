package com.aurionpro.ocp.solution.model;



public class FixedDeposit {
	private int accountNo;
	private String name;
	private double principleAmt;
	private double interestRate;
	private int duration;
	private IFestivalOffer offer;
	
	public FixedDeposit(int accountNo, String name, double principleAmt, int duration, IFestivalOffer offer) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.principleAmt = principleAmt;
		this.duration = duration;
		this.offer = offer;
	}

	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipleAmt() {
		return principleAmt;
	}
	public void setPrincipleAmt(double principleAmt) {
		this.principleAmt = principleAmt;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public IFestivalOffer getOffer() {
		return offer;
	}
	public void setOffer(IFestivalOffer offer) {
		this.offer = offer;
	}
	
	public double calculateInterest(IFestivalOffer offer) {
		return (getDuration()*offer.getInterestRate()*getPrincipleAmt()/100)+ getPrincipleAmt();
	}


	@Override
	public String toString() {
		return "FixedDeposit [accountNo=" + accountNo + ", name=" + name + ", principleAmt=" + principleAmt
				+ ", interestRate=" + offer.getInterestRate() + ", duration=" + duration + ", offer=" + offer +", InterestAmt"+calculateInterest(offer)+ "]";
	}
	
	
}
