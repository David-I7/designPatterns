package structural.bridge.java.remotes;

import structural.bridge.java.devices.Device;

import java.util.UUID;

public abstract class Remote {

    protected Device device;

    public Remote(Device device){
        this.device = device;
    }

    public void togglePower(){
        device.enable();
    }
    public void volumeDown(){
        device.setVolume(device.getVolume() - 1);
    };
    public void channelUp(){
        device.setChannel(UUID.randomUUID().toString());
    };
    public void channelDown(){
        device.setChannel(UUID.randomUUID().toString());
    };
}
