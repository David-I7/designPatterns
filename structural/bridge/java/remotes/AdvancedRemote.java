package structural.bridge.java.remotes;

import structural.bridge.java.devices.Device;

public class AdvancedRemote extends Remote{

    private int prevVolume = 0;

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        prevVolume = device.getVolume();
        device.setVolume(0);
    }

    public  void unmute(){
        device.setVolume(prevVolume);
    }
}
