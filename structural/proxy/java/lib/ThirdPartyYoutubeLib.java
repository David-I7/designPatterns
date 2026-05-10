package structural.proxy.java.lib;

import java.util.List;

public interface ThirdPartyYoutubeLib {
    List<Object> listVideos();
    Object getVideoInfo(String id);
    Object downloadVideo(String id);
}

