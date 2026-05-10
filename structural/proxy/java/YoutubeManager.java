package structural.proxy.java;

import structural.proxy.java.lib.ThirdPartyYoutubeLib;

import java.util.List;

public class YoutubeManager {

    private ThirdPartyYoutubeLib service;

    public YoutubeManager(ThirdPartyYoutubeLib service){
        this.service=service;
    }

    public void renderListPanel(){
        List<Object> list = service.listVideos();
        // render videos
    }

    public void handleMouseDown(String id){
        Object info = service.getVideoInfo(id);
        Object video = service.downloadVideo(id);
        // render video
    }
}
