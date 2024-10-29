package com.aurionpro.ocp.violation.model;

import com.aurionpro.ocp.solution.model.IFestivalOffer;

public class FixedDeposit {

	private int accountNo;
	private String name;
	private double principleAmt;
	private double interestRate;
	private int duration;
	private FestivalOffer offer;
	public FixedDeposit(int accountNo, String name, double principleAmt, int duration, int offer) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.principleAmt = principleAmt;
		this.duration = duration;
		this.offer = FestivalOffer.Offer(offer);
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
	public FestivalOffer getOffer() {
		return offer;
	}
	public void setOffer(FestivalOffer offer) {
		this.offer = offer;
	}
	public double calculateInterest(FestivalOffer offer) {
		double interestAmt =0;
		 if( offer == FestivalOffer.Diwali )
			return (getDuration()*8*getPrincipleAmt()/100)+ getPrincipleAmt();
		 if( offer == FestivalOffer.Chirstmas )
				return (getDuration()*8*getPrincipleAmt()/100)+ getPrincipleAmt();
		 if( offer == FestivalOffer.Holi )
				return (getDuration()*8*getPrincipleAmt()/100)+ getPrincipleAmt();
		 if( offer == FestivalOffer.NewYear )
				return (getDuration()*8*getPrincipleAmt()/100)+ getPrincipleAmt();
		return interestAmt;
	}
	@Override
	public String toString() {
		return "FixedDeposit [accountNo=" + accountNo + ", name=" + name + ", principleAmt=" + principleAmt
				+ ", interestRate=" + interestRate + ", duration=" + duration + ", offer=" + offer
				+ ", calculateInterest()=" + calculateInterest(offer) + "]";
	}
	
	
}
