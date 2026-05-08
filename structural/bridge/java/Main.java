package structural.bridge.java;

import structural.bridge.java.devices.Radio;
import structural.bridge.java.remotes.AdvancedRemote;
import structural.bridge.java.remotes.Remote;

public class Main {
    public static void main(String[] args) {
        Remote remote = new AdvancedRemote(new Radio());

        remote.channelUp();
        remote.togglePower();
    }
}
