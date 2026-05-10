package structural.flyweight.java;

import java.util.Map;

public class TreeFactory {
    static Map<String,TreeType> cache;

    public static TreeType getTreeType(String name,String color, String texture){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(":").append(color).append(":").append(texture);

        return cache.putIfAbsent(stringBuilder.toString(),new TreeType(name,color,texture));
    }


}
