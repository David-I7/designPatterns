package structural.bridge.java.devices;

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int num);
    String getChannel();
    void setChannel(String channel);
}

