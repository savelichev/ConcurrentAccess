package net.savelichev.mapI;

import java.util.HashMap;
import java.util.Map;


/**
 * Contains hash map without synchronization
 */
public class MapContainer {


    private Map<Integer, Integer> hashMap = new HashMap<>();

    /**
     * Insert data into map
     * @param key key for inserting
     * @param value value for inserting
     */
    public void writeData(int key, int value) {

        hashMap.put(key, value);
    }


    /**
     * Read each element in map and out it in to console
     */
    public void readData() {

        for (int key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }


}
