package behavioral.observer.java;

import behavioral.observer.java.eventListeners.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String,List<EventListener>> listenerMap = new HashMap();

    public EventManager(){}

    public void subscribe(String eventType,EventListener listener){
        List<EventListener> eventListeners = listenerMap.computeIfAbsent(eventType,(k)-> new ArrayList<>());
        eventListeners.add(listener);
    }
    public void unSubscribe(String eventType,EventListener listener){
        List<EventListener> eventListeners = listenerMap.get(eventType);
        if(eventListeners == null) return;
        eventListeners.remove(listener);
        if(eventListeners.isEmpty()){
            listenerMap.remove(eventType);
        }
    }
    public void notify(String eventType,String data){
        List<EventListener> eventListeners = listenerMap.get(eventType);
        if(eventListeners == null) return;
        eventListeners.forEach(listener -> listener.update(data));
    }
}
