package com.aurionpro.exception;

public class StockTranscationException extends  RuntimeException{

	public String getMessage() {
		return "SomeThing went Wrong!";
	}
}
