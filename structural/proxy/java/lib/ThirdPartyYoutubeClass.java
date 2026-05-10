package structural.proxy.java.lib;

import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{

    @Override
    public List<Object> listVideos() {
        return List.of();
    }

    @Override
    public Object getVideoInfo(String id) {
        return null;
    }

    @Override
    public Object downloadVideo(String id) {
        return null;
    }
}
