package structural.proxy.java;

import structural.proxy.java.lib.ThirdPartyYoutubeLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private List<Object> listCache = new ArrayList<>();
    private Map<String,Object> infoCache = new HashMap<>();
    private Map<String,Object> downloadCache = new HashMap<>();

    // Should also implement some expiration mechanism

    public CachedYoutubeClass(ThirdPartyYoutubeLib service){
        this.service = service;
    }

    @Override
    public List<Object> listVideos() {
        if(listCache.isEmpty()){
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public Object getVideoInfo(String id) {
        return infoCache.putIfAbsent(id,service.getVideoInfo(id));
    }

    @Override
    public Object downloadVideo(String id) {
        return infoCache.putIfAbsent(id,service.downloadVideo(id));
    }
}
