package net.savelichev.mapIII.concurentmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;


public class MapContainer {

    private ConcurrentMap<Integer, Integer> concurrentMap = new ConcurrentHashMap<>();

    /**
     * Insert data into map
     * @param key key for inserting
     * @param value value for inserting
     */
    public void writeData(int key, int value) {

        concurrentMap.put(key, value);
    }

    /**
     * Read each element in map and out it in to console
     */
    public void readData() {

        for (int key : concurrentMap.keySet()) {
            System.out.println(concurrentMap.get(key));
        }
    }


}
