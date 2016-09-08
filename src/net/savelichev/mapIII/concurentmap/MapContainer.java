package net.savelichev.mapIII.concurentmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class MapContainer {

    private ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();

    public void writeData(int key, int value) {

        concurrentMap.put(key, value);
    }

    public void readData() {

        for (int key : concurrentMap.keySet()) {
            System.out.println(concurrentMap.get(key));
        }
    }


}
