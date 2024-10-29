package com.aurionpro.command.test;

import com.aurionpro.command.model.AdjustVolume;
import com.aurionpro.command.model.ChangeChanel;
import com.aurionpro.command.model.Command;
import com.aurionpro.command.model.RemoteControl;
import com.aurionpro.command.model.Stereo;
import com.aurionpro.command.model.TV;
import com.aurionpro.command.model.TurnOffCommand;
import com.aurionpro.command.model.TurnOnCommand;

public class TVSetControl {

	public static void main(String[] args) {
       
        TV tv = new TV();
        Stereo stereo = new Stereo();

       
        Command turnOnTVCommand = new TurnOnCommand(tv);
        Command turnOffTVCommand = new TurnOffCommand(tv);
        Command adjustVolumeStereoCommand = new AdjustVolume(stereo);
        Command changeChannelTVCommand = new ChangeChanel(tv);

        RemoteControl remote = new RemoteControl();
        
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); 

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); 

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); 

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); 
	}

}
