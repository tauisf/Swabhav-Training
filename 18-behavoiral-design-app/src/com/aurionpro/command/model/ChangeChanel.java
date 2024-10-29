package com.aurionpro.command.model;

public class ChangeChanel implements Command{
	private TV tv;

    public ChangeChanel(TV tv) {
        this.tv = tv;
    }

	@Override
	public void excute() {
		 tv.changeChannel();
		
	}
}
