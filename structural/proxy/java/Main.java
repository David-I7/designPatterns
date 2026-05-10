package structural.proxy.java;

import structural.proxy.java.lib.ThirdPartyYoutubeClass;

public class Main {
    public static void main(String[] args) {
        YoutubeManager youtubeManager = new YoutubeManager(new CachedYoutubeClass(new ThirdPartyYoutubeClass()));
    }
}
