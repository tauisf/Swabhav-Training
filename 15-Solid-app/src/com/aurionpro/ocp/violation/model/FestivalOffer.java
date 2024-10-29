package com.aurionpro.ocp.violation.model;

public enum FestivalOffer {
Diwali, Holi, Chirstmas,NewYear;
public static  FestivalOffer  Offer(int offer) {
	
	if(offer == 1)
	  return Diwali ;
	if(offer == 2)
		  return Holi ;
	if(offer == 3)
		  return Chirstmas ;
	if(offer == 4)
		  return NewYear ;
	return null;
	
}

}

