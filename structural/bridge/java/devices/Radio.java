package structural.bridge.java.devices;

public class Radio implements Device{

    boolean enabled = false;
    int volume = 0;
    String channel = "KissFM";

    public Radio(){

    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int num) {
        volume = Math.max(0,Math.min(100,num));
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public void setChannel(String channel) {
        this.channel = channel;
    }
}

