package com.aurionpro.command.model;

public class AdjustVolume implements Command {
	 private Stereo stereo;

	    public AdjustVolume(Stereo stereo) {
	        this.stereo = stereo;
	    }


		@Override
		public void excute() {
			stereo.adjustVolume();
			
		}
}
